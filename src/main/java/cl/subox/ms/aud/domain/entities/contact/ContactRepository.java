package cl.subox.ms.aud.domain.entities.contact;

import cl.subox.ms.aud.domain.entities.role.Role;

public interface ContactRepository {
    User saveUser(User user);

    void addRoleToUserByUserName(String userName, Role role);

    void addRoleToUserByEmail(String email, Role role);

    void addRoleToUserById(Long id, Role role);

    User getUserById(Long id);

    User getUserByUserName(String userName);

    User getUserByEmail(String email);

    Boolean validUserForRegisterLocal(User user);
}
