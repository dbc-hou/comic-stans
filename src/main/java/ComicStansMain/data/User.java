package ComicStansMain.data;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDate;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "abyx_users")

public class User {
    //Instance variables:
    public enum Role {VISITOR, USER, PREMIUM, ADMIN}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, length = 32)
    private String username;

    @Email
    @NotEmpty
    @Column(nullable = false, length = 100)
    private String email;

    @Column
    private boolean emailVerified;

    @Column(nullable = false, length = 32)
    @ToString.Exclude
    private String password;

    @Column(nullable = true)
    private LocalDate dateJoined;

    @Column(nullable = false)
    private String preferredLanguage;

    @Column(nullable = false, length = 50)
    private String locationRegion;

    @Column(nullable = false, length = 50)
    private String locationCountry;

    @Column(nullable = true)
    private String aboutUserText;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Role accessLevel;

}