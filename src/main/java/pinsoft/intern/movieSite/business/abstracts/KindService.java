package pinsoft.intern.movieSite.business.abstracts;

import pinsoft.intern.movieSite.business.requests.CreateKindRequest;
import pinsoft.intern.movieSite.business.responses.GetAllKindsResponse;

import java.util.List;

public interface KindService {
    List<GetAllKindsResponse> getAll();
    void add(CreateKindRequest createKindRequest);
    void delete();


}
