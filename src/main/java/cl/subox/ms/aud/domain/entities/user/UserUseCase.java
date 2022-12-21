package cl.subox.ms.aud.domain.entities.user;

import lombok.RequiredArgsConstructor;


    @RequiredArgsConstructor
    public class UserUseCase implements IUserUseCase{

        final IUserUseCase userUseCase;

        @Override
        public void enviarCorreoElectronicoDeValidacion() {
            userUseCase.enviarCorreoElectronicoDeValidacion();
        }

        @Override
        public void ratificarTokenCorreoElectronico() {
            userUseCase.ratificarTokenCorreoElectronico();
        }

        @Override
        public void ratificarNombreDeUsuario() {
            System.out.println("13-v");
            userUseCase.ratificarNombreDeUsuario();
        }

        @Override
        public void ratificarCorreoElectronico() {
            userUseCase.ratificarCorreoElectronico();
        }

        /*
            CRITERIOS DE ACEPTACION:
             - Choose a username 6–30 characters long.
             - Los nombres de usuario pueden contener letras (a-z), números (0-9) y puntos (.)
        * */
        @Override
        public void registarUsuarioValidoEnElSistema(User user) {
            userUseCase.registarUsuarioValidoEnElSistema(user);
        }
    }
