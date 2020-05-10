package es.correos.arq.correo_orden_ms.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "clientes")
public class Cliente {
	
	@Id
	@Column(name = "clienteid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int clienteid;

	@Column(name = "cedula_ruc")
	private char cedulaRuc;

	@Column(name = "nombrecia")
	private char nombrecia;

	@Column(name = "nombrecontacto")
	private char nombrecontacto;

	@Column(name = "direccioncli")
	private char direccioncli;

	@Column(name = "fax")
	private char fax;

	@Column(name = "email")
	private char email;

	@Column(name = "celular")
	private char celular;

	@Column(name = "fijo")
	private char fijo;

}
