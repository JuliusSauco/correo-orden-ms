package es.correos.arq.correo_orden_ms.mapper;

import java.util.List;
import org.mapstruct.Mapper;
import es.correos.arq.correo_orden_ms.domain.Producto;
import es.correos.arq.correo_orden_ms.dto.ProductoDTO;

@Mapper
public interface ProductoMapper {

	ProductoDTO productoToProductoDto(Producto producto);

	List<ProductoDTO> productoToProductoDto(List<Producto> producto);

	Producto productoDtoToProducto(ProductoDTO productoDto);

	List<Producto> productoDtoToProducto(List<ProductoDTO> productoDto);
}
