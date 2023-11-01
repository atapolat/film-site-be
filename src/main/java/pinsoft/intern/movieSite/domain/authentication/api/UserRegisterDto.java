package pinsoft.intern.movieSite.domain.authentication.api;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserRegisterDto {

    private String firstName;
    private String lastName;
    private String email;
    private String password;
}
