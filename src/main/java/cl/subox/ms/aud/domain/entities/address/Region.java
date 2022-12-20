package cl.subox.ms.aud.domain.entities.address;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "region")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Region {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "region_id")
    private Long id;

    private String code;

    private String name;

}