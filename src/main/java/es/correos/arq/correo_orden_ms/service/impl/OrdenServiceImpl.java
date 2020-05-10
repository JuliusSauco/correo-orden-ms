package es.correos.arq.correo_orden_ms.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import es.correos.arq.correo_orden_ms.domain.Orden;
import es.correos.arq.correo_orden_ms.repository.OrdenRepository;
import es.correos.arq.correo_orden_ms.service.OrdenService;

@Service
public class OrdenServiceImpl implements OrdenService {
	
	@Autowired
	private OrdenRepository ordenRepository;

	@Override
	public void guardarOrden(Orden orden) {
		ordenRepository.saveAndFlush(orden);
	}

	@Override
	public List<Orden> listarOrdenes() {
		return ordenRepository.findAll();
	}

	@Override
	public void actualizarOrden(Orden orden) {
		ordenRepository.saveAndFlush(orden);
	}

	@Override
	public void eliminarOrden(int id) {
		Orden eliminar = ordenRepository.findByOrdenid(id);
		ordenRepository.delete(eliminar);
	}

	@Override
	public Orden buscarOrdenPorId(int id) {
		return ordenRepository.findByOrdenid(id);
	}

}
