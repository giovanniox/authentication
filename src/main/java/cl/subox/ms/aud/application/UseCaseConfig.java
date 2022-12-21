package cl.subox.ms.aud.application;

import cl.subox.ms.aud.domain.entities.user.IUserUseCase;
import cl.subox.ms.aud.domain.entities.user.UserUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class UseCaseConfig {

    @Bean
    public UserUseCase userUseCase(final IUserUseCase userUseCase) {
        return new UserUseCase(userUseCase);
    }


}