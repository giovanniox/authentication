package cl.subox.ms.aud.domain.entities.user;


public interface IUserUseCase {

     void enviarCorreoElectronicoDeValidacion();

     void ratificarTokenCorreoElectronico();

     void ratificarNombreDeUsuario();

     void ratificarCorreoElectronico();

     void registarUsuarioValidoEnElSistema(User user);
}
