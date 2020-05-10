package es.correos.arq.correo_orden_ms.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClienteDTO {
	private int clienteid;
	private char cedulaRuc;
	private char nombrecia;
	private char nombrecontacto;
	private char direccioncli;
	private char fax;
	private char email;
	private char celular;
	private char fijo;
}