package cl.duoc.api.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.duoc.api.model.entities.Venta;

public interface VentaRepository extends JpaRepository<Venta, Integer>{
    
}
