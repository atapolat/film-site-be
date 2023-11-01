package pinsoft.intern.movieSite.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetByIdKindResponse {
    private int id;
    private String name;
}
