package es.correos.arq.correo_orden_ms.service;

import java.util.List;
import es.correos.arq.correo_orden_ms.domain.Producto;

public interface ProductoService {
	
	Producto buscarProductoPorId(int id);

	void guardarProducto(Producto producto);

	List<Producto> listarProducto();

	void actualizarProducto(Producto producto);

	void eliminarProducto(int id);
	
}
