package cl.subox.ms.aud.domain.entities.role;

import cl.subox.ms.aud.domain.entities.role.enums.RoleName;
import cl.subox.ms.aud.domain.entities.role.enums.RoleRank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "role")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Role implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private Long id;

    @Column(name = "role_name")
    private RoleName name;

    @Column(name = "role_rank")
    private RoleRank rank;
}
