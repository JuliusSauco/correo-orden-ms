package es.correos.arq.correo_orden_ms.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "detalle_ordenes")
public class DetalleOrden {
	
	@Id
	@Column(name = "ordenid")
	private int idOrden;
	
	@Column(name = "detalleid")
	private int idDetalle;
	
	@Column(name = "productoid")
	private int idProducto;
	
	@Column(name = "cantidad")
	private int cantidad;
}
