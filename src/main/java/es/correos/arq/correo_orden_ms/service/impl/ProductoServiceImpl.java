package es.correos.arq.correo_orden_ms.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import es.correos.arq.correo_orden_ms.domain.Producto;
import es.correos.arq.correo_orden_ms.repository.ProductoRepository;
import es.correos.arq.correo_orden_ms.service.ProductoService;

@Service
public class ProductoServiceImpl implements ProductoService {

	@Autowired
	private ProductoRepository productoRepository;
	
	@Override
	public Producto buscarProductoPorId(int id) {
		return productoRepository.findByProductoid(id);
	}

	@Override
	public void guardarProducto(Producto producto) {
		productoRepository.saveAndFlush(producto);
	}

	@Override
	public List<Producto> listarProducto() {
		return productoRepository.findAll();
	}

	@Override
	public void actualizarProducto(Producto producto) {
		productoRepository.saveAndFlush(producto);
	}

	@Override
	public void eliminarProducto(int id) {
		Producto eliminar = productoRepository.findByProductoid(id);
		productoRepository.delete(eliminar);
	}

}
