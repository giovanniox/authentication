package cl.subox.ms.aud.infraestructure.repository;


import cl.subox.ms.aud.domain.entities.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}