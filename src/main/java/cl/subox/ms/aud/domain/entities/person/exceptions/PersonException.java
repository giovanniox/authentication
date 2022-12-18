package cl.subox.ms.aud.domain.entities.person.exceptions;

import cl.subox.ms.aud.domain.entities.person.enums.ContactExceptionEnum;

public class PersonException extends RuntimeException {
    public PersonException(Throwable throwable) {
        super(throwable);
    }

    public PersonException(String msg, Throwable throwable) {
        super(msg, throwable);
    }

    public PersonException(String msg) {
        super(msg);
    }

    public PersonException(ContactExceptionEnum msg) {
        super(msg.toString());
    }
}