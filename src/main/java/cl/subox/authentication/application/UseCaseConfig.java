package cl.subox.authentication.application;

import cl.subox.authentication.domain.role.RoleUseCase;
import cl.subox.authentication.domain.user.UserUseCase;
import cl.subox.authentication.infraestructure.repository.RoleRepository;
import cl.subox.authentication.infraestructure.repository.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class UseCaseConfig {

    @Bean
    public RoleUseCase getRoleUserCase(final RoleRepository roleRepository) {
        return new RoleUseCase(roleRepository);
    }

    @Bean
    public UserUseCase getUserUseCase(final UserRepository userRepository) {
        return new UserUseCase(userRepository);
    }
}
