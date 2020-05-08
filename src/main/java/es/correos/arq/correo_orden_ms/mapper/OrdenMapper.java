package es.correos.arq.correo_orden_ms.mapper;

import java.util.List;
import org.mapstruct.Mapper;
import es.correos.arq.correo_orden_ms.domain.Orden;
import es.correos.arq.correo_orden_ms.dto.OrdenDTO;

@Mapper
public interface OrdenMapper {
	
	OrdenDTO ordenToOrdenDTO(Orden orden);
	
	List<OrdenDTO> ordenToOrdenDTO(List<Orden> orden);
	
	Orden ordenDTOToOrden(OrdenDTO ordenDTO);
	
	List<Orden> ordenDTOToOrden(List<OrdenDTO> ordenDTO);
}
