package pinsoft.intern.movieSite.domain.authentication.impl;

import pinsoft.intern.movieSite.domain.authentication.api.UserRegisterDto;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserRegisterRequest {

    private String firstName;
    private String lastName;
    private String email;
    private String password;

    public UserRegisterDto toDto(){
        return UserRegisterDto.builder()
                .firstName(firstName)
                .lastName(lastName)
                .email(email)
                .password(password)
                .build();
    }
}
