package cl.subox.ms.aud.domain.entities.contact;

import cl.subox.ms.aud.infraestructure.repository.UserRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ContactUseCase implements ContactRepository {


    private final UserRepository userRepository;

}
