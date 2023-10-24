package pinsoft.intern.movieSite.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllKindsResponse {
    private int id;
    private String name;

}
