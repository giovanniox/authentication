package cl.subox.ms.aud.application;

import cl.subox.ms.aud.domain.entities.user.UserUseCase;
import cl.subox.ms.aud.infraestructure.repository.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class UseCaseConfig {

    @Bean
    public UserUseCase userUseCase(final UserRepository userRepository) {
        return new UserUseCase(userRepository);
    }


}