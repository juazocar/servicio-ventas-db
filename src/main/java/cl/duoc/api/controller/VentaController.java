package cl.duoc.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import cl.duoc.api.model.dto.VentaDTO;
import cl.duoc.api.service.VentaService;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
public class VentaController {

    @Autowired
    VentaService ventaService;

    @PostMapping(path = "/crear-venta")
    public String crearVenta(@RequestBody VentaDTO ventaDTO){
        log.info("Creando venta en el database");
        return ventaService.crearVenta(ventaDTO);
        
    }
    
}
