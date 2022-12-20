package cl.subox.ms.aud.domain.entities.user;

import cl.subox.ms.aud.domain.entities.contact.Contact;
import cl.subox.ms.aud.domain.entities.person.Person;
import cl.subox.ms.aud.domain.entities.role.Role;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Table(name = "user")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, name = "user_id")
    private Long id;

    @Column(unique = true, length = 20, name = "user_name")
    private String userName;

    @Column(length = 60)
    private String password;

    private Boolean enabled;

    @Column(name = "email_valid")
    private Boolean emailValid;

    @ManyToMany
    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "role_id"), uniqueConstraints = {
            @UniqueConstraint(columnNames = {"user_id", "role_id"})})
    private List<Role> roles = new java.util.ArrayList<>();

    @Column(name = "create_at", nullable = false)
    private Long createAt;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "contact_id", nullable = true)
    private Contact contact;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "person_id", nullable = true)
    private Person person;


}
