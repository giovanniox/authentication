package cl.subox.ms.aud.domain.entities.user.enums;

import org.springframework.http.HttpStatus;

public enum UserExceptionEnum {
    DATABASE(0, "A database error has occurred.", HttpStatus.INTERNAL_SERVER_ERROR),
    DUPLICATE_USER_NAME(1, "This user already exists.", HttpStatus.CONFLICT),
    MUST_HAVE_ROLES(3, "This user not have roles.", HttpStatus.INTERNAL_SERVER_ERROR),
    BAD_REQUEST(3, "BAD_REQUEST", HttpStatus.BAD_REQUEST),
    DUPLICATE(4, "This user already exists.", HttpStatus.CONFLICT),
    EMAIL_INVALID(5, "this email is invalid", HttpStatus.CONFLICT);

    private final int code;
    private final String description;


    private final HttpStatus status;

    UserExceptionEnum(int code, String description, HttpStatus status) {
        this.code = code;
        this.description = description;
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public int getCode() {
        return code;
    }

    public HttpStatus getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return code + ": " + description;
    }
}