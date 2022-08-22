package cl.subox.authentication.domain.user.exceptions;

import cl.subox.authentication.domain.user.enums.UserExceptionEnum;

public class UserException extends RuntimeException {
    public UserException(Throwable throwable) {
        super(throwable);
    }

    public UserException(String msg, Throwable throwable) {
        super(msg, throwable);
    }

    public UserException(String msg) {
        super(msg);
    }

    public UserException(UserExceptionEnum msg) {
        super(msg.toString());
    }
}