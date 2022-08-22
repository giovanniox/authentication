package cl.subox.authentication.domain.user;

import cl.subox.authentication.domain.role.Role;

public interface UserRepository {
    User saveUser(User user);

    void addRoleToUserByUserName(String userName, Role role);

    void addRoleToUserByEmail(String email, Role role);

    void addRoleToUserById(Long id, Role role);

    User getUserById(Long id);

    User getUserByUserName(String userName);

    User getUserByEmail(String email);

    Boolean validUserForRegisterLocal(User user);
}
