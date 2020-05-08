package es.correos.arq.correo_orden_ms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import es.correos.arq.correo_orden_ms.domain.Orden;

@Repository
public interface OrdenRepository extends JpaRepository<Orden, Long> {
	
	Orden findByOrdenid(int id);
}
