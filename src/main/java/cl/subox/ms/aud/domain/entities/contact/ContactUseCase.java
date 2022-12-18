package cl.subox.ms.aud.domain.entities.contact;

import cl.subox.ms.aud.domain.entities.contact.enums.UserExceptionEnum;
import cl.subox.ms.aud.domain.entities.contact.exceptions.UserException;
import cl.subox.ms.aud.domain.entities.role.Role;
import cl.subox.ms.aud.infraestructure.repository.UserRepository;
import lombok.RequiredArgsConstructor;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@RequiredArgsConstructor
public class ContactUseCase implements ContactRepository {


    private final UserRepository userRepository;


    @Override
    public User saveUser(User user) {

        if (user.getRoles().isEmpty()) {
            throw new UserException(UserExceptionEnum.MUST_HAVE_ROLES.toString());
        }

        return this.userRepository.save(user);
    }

    @Override
    public void addRoleToUserByUserName(String userName, Role role) {

    }

    @Override
    public void addRoleToUserByEmail(String email, Role role) {

    }

    @Override
    public void addRoleToUserById(Long id, Role role) {

    }

    @Override
    public User getUserById(Long id) {
        var findUser = this.userRepository.findById(id);
        if (findUser.get() != null) {
            return findUser.get();
        }
        throw new UserException("find user with id: " + id + " but not found");
    }

    @Override
    public User getUserByUserName(String name) {
        throw new UserException("find user with name: " + name + " but not found");
    }

    @Override
    public User getUserByEmail(String email) {
        throw new UserException("find user with name: " + email + " but not found");
    }

    @Override
    public Boolean validUserForRegisterLocal(User user) {
        var email = user.getEmail();
        var userName = user.getUserName();
        var roles = user.getRoles();


        if (email == null || userName == null || userName.trim().equals("") || email.trim().equals("") || !user.isValidateEmail(email) || validar(email) || validar(userName) || roles.size() == 0) {
            return false;
        }

        if (roles.size() == 0){
            return false;
        }

        var userTo = userRepository.findUserByUserNameAndEmail(userName, email);
        return userTo != null;
    }

    public static boolean validar(String userName){

        boolean estado = false;
        Pattern pat = Pattern.compile("/^[a-z0-9_-]{6,16}$/");
        Matcher mat = pat.matcher(userName);

        if(mat.matches()){
            System.out.println("Cadena Valida");
            estado=true;
        }
        else{
            System.out.println("Cadena Invalida");
            estado=false;
        }
        return estado;
    }
}
