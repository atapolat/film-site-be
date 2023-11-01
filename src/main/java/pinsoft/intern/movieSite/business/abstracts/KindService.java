package pinsoft.intern.movieSite.business.abstracts;

import pinsoft.intern.movieSite.business.requests.CreateKindRequest;
import pinsoft.intern.movieSite.business.requests.UpdateKindRequest;
import pinsoft.intern.movieSite.business.responses.GetAllKindsResponse;
import pinsoft.intern.movieSite.business.responses.GetByIdKindResponse;


import java.util.List;

public interface KindService {
    List<GetAllKindsResponse> getAll();
    GetByIdKindResponse getById (int id);
    void add(CreateKindRequest createKindRequest);
    void update(UpdateKindRequest updateKindRequest);
    void delete(int id);




}
