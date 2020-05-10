package es.correos.arq.correo_orden_ms.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DetalleOrdenDTO {
	private int idOrden;
	private int idDetalle;
	private int idProducto;
	private int cantidad;
}