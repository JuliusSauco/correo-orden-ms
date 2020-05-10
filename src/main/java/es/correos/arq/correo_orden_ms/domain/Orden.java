package es.correos.arq.correo_orden_ms.domain;

import java.sql.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
@Table(name = "ordenes")
public class Orden {

	@Id
	@Column(name = "ordenid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ordenid;

	@Column(name = "empleadoid")
	private int empleadoid;

	@Column(name = "clienteid")
	private int clienteid;

	@Column(name = "fechaorden")
	private Date fechaorden;

	@Column(name = "descuento")
	private int descuento;
	
	@OneToMany(mappedBy = "orden", cascade = CascadeType.ALL)
	private List<DetalleOrden> detalleOrden;
	
}
