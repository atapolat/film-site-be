package pinsoft.intern.movieSite.domain.authentication.api;

import pinsoft.intern.movieSite.domain.user.api.UserDto;
import pinsoft.intern.movieSite.domain.user.api.UserRegisterDto;
import pinsoft.intern.movieSite.domain.authentication.impl.AuthenticationResponse;
import pinsoft.intern.movieSite.domain.authentication.impl.AuthenticationRequest;


public interface AuthenticationService {

    AuthenticationResponse login(AuthenticationRequest request);
    UserDto register(UserRegisterDto dto);

}
