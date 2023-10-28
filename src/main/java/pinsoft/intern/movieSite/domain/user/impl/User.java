package pinsoft.intern.movieSite.domain.user.impl;

import com.filmmania.library.entity.AbstractEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = User.TABLE)
public class User extends AbstractEntity {
    public static final String TABLE = "usr";
    private static final String COL_FIRST_NAME = "first_name";
    private static final String COL_LAST_NAME = "last_name";
    private static final String COL_EMAIL = "email";
    private static final String COL_PASSWORD = "password";
    private static final String COL_STATUS = "status";
    private static final String COL_ROLE = "role";
    private static final String COL_AMOUNT = "amount";

    @Column(name = COL_FIRST_NAME)
    private String firstName;
    @Column(name = COL_LAST_NAME)
    private String lastName;
    @Column(name = COL_EMAIL, nullable = false, unique = true)
    private String email;
    @Column(name = COL_PASSWORD, nullable = false)
    private String password;
    @Column(name = COL_STATUS)
    private Boolean status;
    @Column(name = COL_AMOUNT)
    private Double amount;
    @Column(name = COL_ROLE)
    @Enumerated(EnumType.STRING)
    private UserRole role;

}
