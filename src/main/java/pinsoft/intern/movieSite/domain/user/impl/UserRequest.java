package pinsoft.intern.movieSite.domain.user.impl;

import lombok.Builder;
import lombok.Data;
import pinsoft.intern.movieSite.domain.user.api.UserDto;

@Data
@Builder
public class UserRequest {

    private String firstName;
    private String lastName;
    private String email;

    public UserDto toDto(){
        return UserDto.builder()
                .firstName(firstName)
                .lastName(lastName)
                .email(email)
                .build();
    }

}
