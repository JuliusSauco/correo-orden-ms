package es.correos.arq.correo_orden_ms.domain;

import java.math.BigDecimal;
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
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "productos")
public class Producto {
	
	@Id
	@Column(name = "productoid")
	private int productoid;

	@Column(name = "proveedorid")
	private int proveedorid;

	@Column(name = "categoriaid")
	private int categoriaid;

	@Column(name = "descripcion")
	private char descripcion;

	@Column(name = "preciounit")
	private BigDecimal preciounit;

	@Column(name = "existencia")
	private int existencia;

}
