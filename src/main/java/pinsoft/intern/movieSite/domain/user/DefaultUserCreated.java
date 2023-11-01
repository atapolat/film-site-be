package pinsoft.intern.movieSite.domain.user;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import pinsoft.intern.movieSite.domain.user.impl.User;
import pinsoft.intern.movieSite.domain.user.impl.UserRepository;
import pinsoft.intern.movieSite.domain.user.impl.UserRole;

@Component
@RequiredArgsConstructor
public class DefaultUserCreated {

    private final UserRepository repository;
    //private final BCryptPasswordEncoder passwordEncoder;
    private final String email = "admin";
    private final String password = "admin";

    @EventListener
    public void onApplicationStartUp(ApplicationReadyEvent readyEvent){

        if (repository.findByEmail(email).isEmpty()){
            User user = new User();
            user.setEmail(email);
            //user.setPassword(passwordEncoder.encode(password));
            user.setRole(UserRole.ADMIN);
            repository.save(user);
        }
    }
}
