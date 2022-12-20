package cl.subox.ms.aud.domain.entities.address;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "commune")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Commune {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "commune_id")
    private Long id;

    private String name;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "city_id")
    private City city;


}