package es.correos.arq.correo_orden_ms.dto;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductoDTO {
	private int productoid;
	private int proveedorid;
	private int categoriaid;
	private char descripcion;
	private BigDecimal preciounit;
	private int existencia;

}
