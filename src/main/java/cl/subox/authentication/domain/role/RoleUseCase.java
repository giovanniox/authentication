package cl.subox.authentication.domain.role;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class RoleUseCase implements RoleRepository {

    private final cl.subox.authentication.infraestructure.repository.RoleRepository roleRepository;

    @Override
    public Role saveRole(Role role) {
        return this.roleRepository.save(role);
    }

    @Override
    public Role getRoleById(Long id) {
        return this.roleRepository.findById(id).get();
    }

    @Override
    public Role getRoleByName(String email) {
        return null;
    }

    @Override
    public Iterable<Role> getRoles() {
        return this.roleRepository.findAll();
    }
}