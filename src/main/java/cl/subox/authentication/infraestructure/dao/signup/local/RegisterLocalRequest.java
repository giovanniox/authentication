package cl.subox.authentication.infraestructure.dao.signup.local;

import cl.subox.authentication.domain.role.Role;

import java.util.Collection;

public class RegisterLocalRequest {

    private String userName;
    private String email;
    private String password;
    private Collection<Role> roles;
}
