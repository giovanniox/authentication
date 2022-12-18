package cl.subox.ms.aud.domain.entities.address.exceptions;

import cl.subox.ms.aud.domain.entities.address.enums.UserExceptionEnum;

public class AddressException extends RuntimeException {
    public AddressException(Throwable throwable) {
        super(throwable);
    }

    public AddressException(String msg, Throwable throwable) {
        super(msg, throwable);
    }

    public AddressException(String msg) {
        super(msg);
    }

    public AddressException(UserExceptionEnum msg) {
        super(msg.toString());
    }
}