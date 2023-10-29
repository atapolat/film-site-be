package pinsoft.intern.movieSite.domain.user.impl;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pinsoft.intern.movieSite.domain.user.api.UserService;

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
        var result = service.updateUser(id,request.toDto());
        return ResponseEntity.ok(UserResponse.toResponse(result));
    }
    @GetMapping
    public ResponseEntity<UserResponse> getAuthenticateUser(){
        var result = UserResponse.toResponse(service.getAuthenticateUser());
        return ResponseEntity.ok(result);
    }



}
