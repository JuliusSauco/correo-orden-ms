package es.correos.arq.correo_orden_ms.exceptions.handler;

import es.correos.arch.boot.core.exception.ErrorCode;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ApplicationErrorCode implements ErrorCode {
	ENTITY_EXISTS_CONFLICT("Entity exists - conflict");

	private final String reasonPhrase;
}
