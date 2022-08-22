package cl.subox.authentication.domain.user;

import cl.subox.authentication.domain.role.Role;
import cl.subox.authentication.domain.user.enums.UserExceptionEnum;
import cl.subox.authentication.domain.user.exceptions.UserException;
import lombok.RequiredArgsConstructor;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@RequiredArgsConstructor
public class UserUseCase implements UserRepository {


    private final cl.subox.authentication.infraestructure.repository.UserRepository userRepository;



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



        if (email == null || userName == null || userName.trim().equals("") || email.trim().equals("") || !user.isValidateEmail(email)) {
            throw new UserException(UserExceptionEnum.BAD_REQUEST);
        }


        var userTo = userRepository.findUserByUserNameAndEmail(userName, email);
        return userTo != null;
    }


}
