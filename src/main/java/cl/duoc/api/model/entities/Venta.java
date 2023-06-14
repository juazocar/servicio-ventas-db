package cl.duoc.api.model.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name ="venta")
public class Venta {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    @Column(name ="id")
    private int id;

    @Basic
    @Column(name="total")
    private int total;

    @Basic
    @Column(name="descuento")
    private double descuento;

    @Basic
    @Column(name="fecha")
    private String fecha;

    @Basic
    @Column(name="webpay_token")
    private String tokenWebpay;
}
