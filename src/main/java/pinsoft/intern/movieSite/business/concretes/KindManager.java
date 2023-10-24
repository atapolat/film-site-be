package pinsoft.intern.movieSite.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pinsoft.intern.movieSite.business.abstracts.KindService;
import pinsoft.intern.movieSite.business.requests.CreateKindRequest;
import pinsoft.intern.movieSite.business.responses.GetAllKindsResponse;
import pinsoft.intern.movieSite.dataAccess.abstracts.KindRepository;
import pinsoft.intern.movieSite.entities.concretes.Kind;

import java.util.ArrayList;
import java.util.List;

@Service
public class KindManager implements KindService {

    private KindRepository kindRepository;

    @Autowired
    public KindManager(KindRepository kindRepository) {
        this.kindRepository = kindRepository;
    }

    @Override
    public List<GetAllKindsResponse> getAll() {

        List<Kind> kinds = kindRepository.findAll();
        List<GetAllKindsResponse> kindsResponse = new ArrayList<GetAllKindsResponse>();

        for (Kind kind: kinds) {
            GetAllKindsResponse responseItem = new GetAllKindsResponse();
            responseItem.setId(kind.getId());
            responseItem.setName(kind.getName());

            kindsResponse.add(responseItem);
        }
        return kindsResponse;
    }

    @Override
    public void add(CreateKindRequest createKindRequest) {
        Kind kind = new Kind();
        kind.setName(createKindRequest.getName());

        this.kindRepository.save(kind);
    }
}
