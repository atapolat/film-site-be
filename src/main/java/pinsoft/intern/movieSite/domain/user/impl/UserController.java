package pinsoft.intern.movieSite.domain.user.impl;

import com.filmmania.domain.user.api.UserDto;
import com.filmmania.domain.user.api.UserFriendsDto;
import com.filmmania.domain.user.api.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@AllArgsConstructor
public class UserController {

    private final UserService service;

    @GetMapping("/{id}")
    public ResponseEntity<UserResponse> getUserById(@PathVariable(value = "id") String id){
        var result = service.getUserById(id);
        return ResponseEntity.ok(UserResponse.toResponse(result));
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserResponse> updateUser(@PathVariable(value = "id") String id,
                                                   @RequestBody UserRequest request){
        var result = service.updateUser(id, request.toDto());
        return ResponseEntity.ok(UserResponse.toResponse(result));
    }
    @GetMapping
    public ResponseEntity<UserResponse> getAuthenticateUser(){
        var result = UserResponse.toResponse(service.getAuthenticateUser());
        return ResponseEntity.ok(result);
    }

    @GetMapping("/all")
    public ResponseEntity<List<UserFriendsDto>> getAllUser(){
        var result = service.getAllUser();
        return ResponseEntity.ok(result);
    }

}
