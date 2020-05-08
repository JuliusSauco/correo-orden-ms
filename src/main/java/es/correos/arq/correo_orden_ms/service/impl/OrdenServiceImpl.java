package es.correos.arq.correo_orden_ms.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import es.correos.arq.correo_orden_ms.domain.Orden;
import es.correos.arq.correo_orden_ms.dto.OrdenDTO;
import es.correos.arq.correo_orden_ms.mapper.OrdenMapper;
import es.correos.arq.correo_orden_ms.repository.OrdenRepository;
import es.correos.arq.correo_orden_ms.service.OrdenService;

@Service
public class OrdenServiceImpl implements OrdenService {
	
	@Autowired
	private OrdenRepository ordenRepository;

	private OrdenMapper ordenMapper;

	@Override
	public void guardarOrden(OrdenDTO orden) {
		ordenRepository.saveAndFlush(ordenMapper.ordenDTOToOrden(orden));
	}

	@Override
	public List<OrdenDTO> listarOrdenes() {
		return ordenMapper.ordenToOrdenDTO(ordenRepository.findAll());
	}

	@Override
	public void actualizarOrden(OrdenDTO orden) {
		ordenRepository.saveAndFlush(ordenMapper.ordenDTOToOrden(orden));
	}

	@Override
	public void eliminarOrden(int id) {
		Orden eliminar = ordenRepository.findByOrdenid(id);
		ordenRepository.delete(eliminar);
	}

	@Override
	public OrdenDTO buscarOrdenPorId(int id) {
		return ordenMapper.ordenToOrdenDTO(ordenRepository.findByOrdenid(id));
	}

}
