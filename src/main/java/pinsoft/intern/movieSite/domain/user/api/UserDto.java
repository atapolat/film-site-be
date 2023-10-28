package pinsoft.intern.movieSite.domain.user.api;

import pinsoft.intern.movieSite.domain.user.impl.UserRole;
import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Builder
public class UserDto {

    private final String id;
    private final Date createdDate;
    private final Date modified;
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String password;
    private final Boolean status;
    private final Double amount;
    private final UserRole role;

}
