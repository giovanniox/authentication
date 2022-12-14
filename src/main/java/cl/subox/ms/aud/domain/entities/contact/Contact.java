package cl.subox.ms.aud.domain.entities.contact;

import cl.subox.ms.aud.domain.entities.user.User;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "contact")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Contact implements Serializable {

    private static final long serialVersionUID = -2041761864921521820L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true)
    private Long id;
    @Column(unique = true, length = 200)
    private String email;
    private Long number;
    @Column(name = "prefix_number", length = 15)
    private String prefixNumber;
    @OneToOne(mappedBy = "contact")
    private User user;

}