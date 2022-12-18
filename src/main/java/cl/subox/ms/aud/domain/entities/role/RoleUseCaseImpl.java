package cl.subox.ms.aud.domain.entities.role;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class RoleUseCaseImpl implements RoleUseCase {

    private final cl.subox.ms.aud.infraestructure.repository.RoleRepository roleRepository;


}