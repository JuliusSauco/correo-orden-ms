package es.correos.arq.correo_orden_ms.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import es.correos.arq.correo_orden_ms.domain.Producto;
import es.correos.arq.correo_orden_ms.dto.ProductoDTO;
import es.correos.arq.correo_orden_ms.mapper.ProductoMapper;
import es.correos.arq.correo_orden_ms.repository.ProductoRepository;
import es.correos.arq.correo_orden_ms.service.ProductoService;

@Service
public class ProductoServiceImpl implements ProductoService {

	@Autowired
	private ProductoRepository productoRepository;

	private ProductoMapper productoMapper;
	
	@Override
	public ProductoDTO buscarProductoPorId(int id) {
		return productoMapper.productoToProductoDto(productoRepository.findByProductoid(id));
	}

	@Override
	public void guardarProducto(ProductoDTO producto) {
		productoRepository.saveAndFlush(productoMapper.productoDtoToProducto(producto));
	}

	@Override
	public List<ProductoDTO> listarProducto() {
		return productoMapper.productoToProductoDto(productoRepository.findAll());
	}

	@Override
	public void actualizarProducto(ProductoDTO producto) {
		productoRepository.saveAndFlush(productoMapper.productoDtoToProducto(producto));
	}

	@Override
	public void eliminarProducto(int id) {
		Producto eliminar = productoRepository.findByProductoid(id);
		productoRepository.delete(eliminar);
	}

}
