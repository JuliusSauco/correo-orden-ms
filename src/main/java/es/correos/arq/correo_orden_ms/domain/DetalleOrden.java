package es.correos.arq.correo_orden_ms.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
	@Column(name = "detalleid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idDetalle;
	
	@ManyToOne
	@JoinColumn(name = "ordenid", nullable = false)
	private Orden orden;
	
	@Column(name = "productoid")
	private int idProducto;
	
	@Column(name = "cantidad")
	private int cantidad;
}
