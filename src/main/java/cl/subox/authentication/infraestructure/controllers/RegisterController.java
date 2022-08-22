package cl.subox.authentication.infraestructure.controllers;

import cl.subox.authentication.domain.user.User;
import cl.subox.authentication.infraestructure.service.implement.RegisterServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@RequiredArgsConstructor
public class RegisterController {
    private final RegisterServiceImpl registerService;

    @RequestMapping(method = RequestMethod.POST, path = "register/local")
    public ResponseEntity<?> signUpWithLocal(@RequestBody User user) {
        return registerService.signUpWithLocal(user);
    }
}
