package es.correos.arq.correo_orden_ms.service;

import java.util.List;
import es.correos.arq.correo_orden_ms.domain.Orden;
import es.correos.arq.correo_orden_ms.dto.OrdenDTO;

public interface OrdenMapperService {
	
	OrdenDTO productoToProductoDto(Orden orden);

	List<OrdenDTO> productoToProductoDto(List<Orden> orden);

	Orden productoDtoToProducto(OrdenDTO producto);

	List<Orden> productoDtoToProducto(List<OrdenDTO> producto);
}
