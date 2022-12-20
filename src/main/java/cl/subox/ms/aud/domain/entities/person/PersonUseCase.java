package cl.subox.ms.aud.domain.entities.person;

import cl.subox.ms.aud.domain.entities.person.enums.ContactExceptionEnum;
import cl.subox.ms.aud.domain.entities.person.exceptions.PersonException;
import cl.subox.ms.aud.domain.entities.role.Role;
import cl.subox.ms.aud.infraestructure.repository.UserRepository;
import lombok.RequiredArgsConstructor;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@RequiredArgsConstructor
public class PersonUseCase implements PersonRepository {


    private final UserRepository userRepository;


}
