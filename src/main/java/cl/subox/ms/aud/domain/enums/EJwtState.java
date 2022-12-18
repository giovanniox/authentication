package cl.subox.ms.aud.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum EJwtState {
    PENDIENTE,
    VALIDADO,
    FINALIZADO
}