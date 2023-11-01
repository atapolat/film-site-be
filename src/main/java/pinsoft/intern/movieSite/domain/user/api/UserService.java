package pinsoft.intern.movieSite.domain.user.api;

import java.util.List;

public interface UserService {
    UserDto getUserById(String id);
    UserDto updateUser(String id, UserDto dto);
    UserDto getAuthenticateUser();
    UserDto createUser(UserDto userDto);
    UserDto getUserByEmail(String email);

}
