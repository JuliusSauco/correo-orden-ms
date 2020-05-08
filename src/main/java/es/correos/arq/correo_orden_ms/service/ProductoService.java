package es.correos.arq.correo_orden_ms.service;

import java.util.List;
import es.correos.arq.correo_orden_ms.dto.ProductoDTO;

public interface ProductoService {
	
	ProductoDTO buscarProductoPorId(int id);

	void guardarProducto(ProductoDTO producto);

	List<ProductoDTO> listarProducto();

	void actualizarProducto(ProductoDTO producto);

	void eliminarProducto(int id);
	
}
