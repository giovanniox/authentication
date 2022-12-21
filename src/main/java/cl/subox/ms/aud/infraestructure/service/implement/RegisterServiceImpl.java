package cl.subox.ms.aud.infraestructure.service.implement;


import cl.subox.ms.aud.domain.entities.user.User;
import cl.subox.ms.aud.infraestructure.repository.UserRepository;
import cl.subox.ms.aud.infraestructure.service.RegisterService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RegisterServiceImpl implements RegisterService {

     final UserRepository userRepository;
    @Override
    public void enviarCorreoElectronicoDeValidacion() {
        System.out.println("15");
    }

    @Override
    public void ratificarTokenCorreoElectronico() {
        System.out.println("14");

    }

    @Override
    public void ratificarNombreDeUsuario() {
        System.out.println("13");

    }

    @Override
    public void ratificarCorreoElectronico() {
        System.out.println("12");

    }

    @Override
    public void registarUsuarioValidoEnElSistema(User user) {
        System.out.println("11");

    }
}
