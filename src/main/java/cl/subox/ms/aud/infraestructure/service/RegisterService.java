package cl.subox.ms.aud.infraestructure.service;

import cl.subox.ms.aud.domain.entities.user.User;
import org.springframework.http.ResponseEntity;


public interface RegisterService {
    ResponseEntity<?> signUpWithLocal(User user);

}
