package cl.subox.authentication.domain.role;


public interface RoleRepository {


    Role saveRole(Role role);

    Role getRoleById(Long id);

    Role getRoleByName(String name);

    Iterable<Role> getRoles();

}
