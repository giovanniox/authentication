package cl.subox.authentication.infraestructure.service;

import cl.subox.authentication.domain.user.User;
import org.springframework.http.ResponseEntity;


public interface RegisterService {
    ResponseEntity<?> signUpWithLocal(User user);

}
