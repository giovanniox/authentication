package cl.subox.ms.aud.domain.entities.person;

import cl.subox.ms.aud.domain.entities.address.Address;
import cl.subox.ms.aud.domain.entities.user.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "person")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, name = "person_id")
    private Long id;

    @Column(length = 45, name = "person_name")
    private String name;

    @Column(length = 45, name = "person_middleName")
    private String middleName;

    @Column(name = "person_lastName", length = 45)
    private String lastName;

    @Column(name = "person_date_birth")
    private Long dateBirth;

    private Boolean sex;

    @Column(name = "person_id_address")
    @OneToMany(cascade = CascadeType.ALL)
    private List<Address> address;

    @OneToMany(mappedBy = "person")
    @Column(name = "person_id_user")
    private List<User> user;


}