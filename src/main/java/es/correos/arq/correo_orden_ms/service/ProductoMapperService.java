package es.correos.arq.correo_orden_ms.service;

import java.util.List;
import es.correos.arq.correo_orden_ms.domain.Producto;
import es.correos.arq.correo_orden_ms.dto.ProductoDTO;


public interface ProductoMapperService {

	ProductoDTO productoToProductoDto(Producto Producto);

	List<ProductoDTO> productoToProductoDto(List<Producto> Producto);

	Producto productoDtoToProducto(ProductoDTO producto);

	List<Producto> productoDtoToProducto(List<ProductoDTO> producto);
	
}
