package cl.duoc.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.duoc.api.model.dto.VentaDTO;
import cl.duoc.api.model.entities.Venta;
import cl.duoc.api.model.repositories.VentaRepository;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class VentaService {

    @Autowired
    VentaRepository ventaRepository;

    public String crearVenta(VentaDTO ventaDTO){
        Venta venta = translateVentaDto(ventaDTO);
        ventaRepository.save(venta);
        return "Venta creada";
    }

    public Venta translateVentaDto(VentaDTO ventaDTO){
        Venta venta = new Venta();
        venta.setTotal(ventaDTO.getTotal());
        venta.setDescuento(ventaDTO.getDescuento());
        venta.setFecha(ventaDTO.getFecha());
        venta.setTokenWebpay(ventaDTO.getWebpayToken());
        return venta;
    }
    
}
