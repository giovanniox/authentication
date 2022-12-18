package cl.subox.ms.aud.infraestructure.service.implement;


import cl.subox.ms.aud.domain.entities.role.RoleUseCaseImpl;
import cl.subox.ms.aud.domain.entities.user.User;
import cl.subox.ms.aud.domain.entities.user.UserUseCase;
import cl.subox.ms.aud.domain.entities.user.enums.Provider;
import cl.subox.ms.aud.domain.entities.user.enums.UserExceptionEnum;
import cl.subox.ms.aud.domain.entities.user.exceptions.UserException;
import cl.subox.ms.aud.infraestructure.service.RegisterService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RegisterServiceImpl implements RegisterService {
    private final RoleUseCaseImpl roleUseCase;
    private final UserUseCase userUseCase;

    @Override
    public ResponseEntity<?> signUpWithLocal(User user) {

        if (userUseCase.validUserForRegisterLocal(user)) {
            return new ResponseEntity<>(UserExceptionEnum.DUPLICATE.toString(), HttpStatus.CONFLICT);
        }
        //armar el objeto
        user.setProvider(Provider.LOCAL);
        try {
            for (Role role : roleUseCase.getRoles()) {
                for (Role role2 : user.getRoles()) {
                    if (role.equals(role2)) {

                    }
                }
            }
            return new ResponseEntity<>(UserExceptionEnum.MUST_HAVE_ROLES.toString(), HttpStatus.UNAUTHORIZED);
        } catch (UserException e) {
            return new ResponseEntity<>(e.toString(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
