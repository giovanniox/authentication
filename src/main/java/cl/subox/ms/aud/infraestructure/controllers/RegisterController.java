package cl.subox.ms.aud.infraestructure.controllers;

import cl.subox.ms.aud.domain.entities.user.User;
import cl.subox.ms.aud.domain.entities.user.UserUseCase;
import cl.subox.ms.aud.infraestructure.service.RegisterService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
@Controller
public class RegisterController  {
     final UserUseCase userUseCase;
    @RequestMapping(method = RequestMethod.GET, path = "/enviarCorreoElectronicoDeValidacion")
    public void enviarCorreoElectronicoDeValidacion() {
        userUseCase.enviarCorreoElectronicoDeValidacion();
    }
    @RequestMapping(method = RequestMethod.GET, path = "/ratificarTokenCorreoElectronico")
    public void ratificarTokenCorreoElectronico() {
        userUseCase.ratificarTokenCorreoElectronico();
    }
    @RequestMapping(method = RequestMethod.GET, path = "/ratificarNombreDeUsuario")
    public void ratificarNombreDeUsuario() {
        userUseCase.ratificarNombreDeUsuario();
    }
    @RequestMapping(method = RequestMethod.GET, path = "/ratificarCorreoElectronico")
    public void ratificarCorreoElectronico() {
        userUseCase.ratificarCorreoElectronico();
    }
    @RequestMapping(method = RequestMethod.POST, path = "/registarUsuarioValidoEnElSistema")

    public void registarUsuarioValidoEnElSistema(@RequestBody @Valid User user) {
        userUseCase.registarUsuarioValidoEnElSistema(user);
    }
}
