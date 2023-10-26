package pinsoft.intern.movieSite.business.concretes;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pinsoft.intern.movieSite.business.abstracts.KindService;
import pinsoft.intern.movieSite.business.requests.CreateKindRequest;
import pinsoft.intern.movieSite.business.requests.UpdateKindRequest;
import pinsoft.intern.movieSite.business.responses.GetAllKindsResponse;
import pinsoft.intern.movieSite.business.responses.GetByIdKindResponse;
import pinsoft.intern.movieSite.core.utilities.mappers.ModelMapperService;
import pinsoft.intern.movieSite.dataAccess.abstracts.KindRepository;
import pinsoft.intern.movieSite.entities.concretes.Kind;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class KindManager implements KindService {

    private KindRepository kindRepository;
    private ModelMapperService modelMapperService;

    @Override
    public List<GetAllKindsResponse> getAll() {

        List<Kind> kinds = kindRepository.findAll();

        List<GetAllKindsResponse> kindsResponse = kinds.stream()
                .map(kind->this.modelMapperService.forResponse()
                        .map(kind, GetAllKindsResponse.class)).collect(Collectors.toList());

        return kindsResponse;
    }

    @Override
    public GetByIdKindResponse getById(int id) {
        Kind kind = this.kindRepository.findById(id).orElseThrow();
        GetByIdKindResponse response = this.modelMapperService.forResponse().map(kind, GetByIdKindResponse.class);
        return response;
    }

    @Override
    public void add(CreateKindRequest createKindRequest) {
        Kind kind = this.modelMapperService.forRequest().map(createKindRequest, Kind.class);

        this.kindRepository.save(kind);
    }

    @Override
    public void update(UpdateKindRequest updateKindRequest) {
        Kind kind = this.modelMapperService.forRequest().map(updateKindRequest, Kind.class);
        this.kindRepository.save(kind);
    }

    @Override
    public void delete(int id) {
        this.kindRepository.deleteById(id);
    }

}
