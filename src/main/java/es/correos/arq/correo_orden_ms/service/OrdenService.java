package es.correos.arq.correo_orden_ms.service;

import java.util.List;
import es.correos.arq.correo_orden_ms.domain.Orden;

public interface OrdenService {
	
	void guardarOrden(Orden orden);

	List<Orden> listarOrdenes();

	void actualizarOrden(Orden orden);

	void eliminarOrden(int id);
	
	Orden buscarOrdenPorId(int id);
}
