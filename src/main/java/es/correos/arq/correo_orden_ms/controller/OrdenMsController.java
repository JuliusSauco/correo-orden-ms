package es.correos.arq.correo_orden_ms.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import es.correos.arq.correo_orden_ms.domain.Orden;
import es.correos.arq.correo_orden_ms.domain.Producto;
import es.correos.arq.correo_orden_ms.service.OrdenService;
import es.correos.arq.correo_orden_ms.service.ProductoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
@Api(value = "/api", tags = "Operaciones con ventas")
public class OrdenMsController {
	
	@Autowired
	private ProductoService productoService;
	
	@Autowired
	private OrdenService ordenService;
	
	@ApiOperation(value = "Acceso a  todos los productos.", notes = "Se pide el listado de todos los productos de la BBDD.")
	@GetMapping(value = "/listarProductos", headers = "Accept=application/json")
	@ApiResponse(code = 401, message = "No se encontro el resultado")
	public ResponseEntity<List<Producto>> listaProductos(){
		List<Producto> listado = productoService.listarProducto();
		if (listado.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}		
		return new ResponseEntity<>(listado,HttpStatus.OK);
	}
	
	@ApiOperation(value = "Acceso a registro de productos", notes = "Insercion de un producto en BBDD.")
	@PostMapping(value = "/producto")
	@ApiResponse(code = 401, message = "No se encontro el resultado")
	public ResponseEntity<Producto> registrarProducto(@RequestBody Producto producto) {
		
		productoService.guardarProducto(producto);

		return new ResponseEntity<>(producto, HttpStatus.CREATED);
	}
	
	@PutMapping("/producto/{id}")
	public ResponseEntity<Producto> actualizarProducto(@PathVariable("id") int id, @RequestBody Producto producto){
		Producto produto = productoService.buscarProductoPorId(id);

		produto.setProveedorid(producto.getProveedorid());
		produto.setCategoriaid(producto.getCategoriaid());
		produto.setDescripcion(producto.getDescripcion());
		produto.setExistencia(producto.getExistencia());
		produto.setPreciounit(producto.getPreciounit());
		
		productoService.actualizarProducto(produto);

		return new ResponseEntity<>(produto, HttpStatus.OK);
	}
	
	@DeleteMapping("/producto/eliminar/{id}")
	public ResponseEntity<Producto> eliminarProducto(@PathVariable("id") int id) {
		
		Producto producto = productoService.buscarProductoPorId(id);
		productoService.eliminarProducto(id);
		
		return new ResponseEntity<>(producto,HttpStatus.ACCEPTED);
	}
	
	@ApiOperation(value = "Acceso a  todos los productos.", notes = "Se pide el listado de todos los productos de la BBDD.")
	@GetMapping(value = "/listarOrdenes", headers = "Accept=application/json")
	@ApiResponse(code = 401, message = "No se encontro el resultado")
	public ResponseEntity<List<Orden>> listaOrdenes(){
		List<Orden> listado = ordenService.listarOrdenes();
		if (listado.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}		
		return new ResponseEntity<>(listado,HttpStatus.OK);
	}

}
