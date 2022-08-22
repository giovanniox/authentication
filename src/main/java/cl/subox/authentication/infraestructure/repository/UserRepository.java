package cl.subox.authentication.infraestructure.repository;

import cl.subox.authentication.domain.user.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    User findUserByEmail(String email);

    User findUserByUserNameAndEmail(String userName, String email);
}
