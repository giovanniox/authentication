package cl.subox.ms.aud.application;

import cl.subox.ms.aud.domain.entities.role.RoleUseCaseImpl;
import cl.subox.ms.aud.infraestructure.repository.RoleRepository;
import cl.subox.ms.aud.infraestructure.repository.UserRepository;
import cl.subox.ms.aud.domain.entities.user.UserUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class UseCaseConfig {

    @Bean
    public RoleUseCaseImpl getRoleUserCase(final RoleRepository roleRepository) {
        return new RoleUseCaseImpl(roleRepository);
    }

    @Bean
    public UserUseCase getUserUseCase(final UserRepository userRepository) {
        return new UserUseCase(userRepository);
    }
}
