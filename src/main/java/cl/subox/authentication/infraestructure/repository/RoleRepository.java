package cl.subox.authentication.infraestructure.repository;

import cl.subox.authentication.domain.role.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {

}
