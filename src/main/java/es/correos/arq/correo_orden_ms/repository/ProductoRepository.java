package es.correos.arq.correo_orden_ms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import es.correos.arq.correo_orden_ms.domain.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {
	
	Producto findByProductoid(int id);
}
