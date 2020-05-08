package es.correos.arq.correo_orden_ms.dto;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrdenDTO {
	private int ordenid;
	private int empleadoid;
	private int clienteid;
	private Date fechaorden;
	private int descuento;

}
