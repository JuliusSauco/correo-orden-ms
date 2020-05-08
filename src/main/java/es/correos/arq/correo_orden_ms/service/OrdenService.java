package es.correos.arq.correo_orden_ms.service;

import java.util.List;
import es.correos.arq.correo_orden_ms.dto.OrdenDTO;

public interface OrdenService {
	
	void guardarOrden(OrdenDTO orden);

	List<OrdenDTO> listarOrdenes();

	void actualizarOrden(OrdenDTO orden);

	void eliminarOrden(int id);
	
	OrdenDTO buscarOrdenPorId(int id);
}
