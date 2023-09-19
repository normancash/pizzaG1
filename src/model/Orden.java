package model;

import java.util.Date;
import java.util.List;

public class Orden {

    private Integer id;
    private Cliente cliente;
    private Sucursal suc;
    private Date fecha;

    private double montoTotal;
    private double subTotal;

    private List<DetalleOrden> detalle ;


    public Orden(Integer id, Cliente cliente
            , Sucursal suc, Date fecha
            , double montoTotal, double subTotal
            , List<DetalleOrden> detalle) {
        this.id = id;
        this.cliente = cliente;
        this.suc = suc;
        this.fecha = fecha;
        this.detalle = detalle;
        for (DetalleOrden d : this.detalle) {
            this.subTotal += d.getSubTotal();
        }
        this.montoTotal*=1.15;

    }

    public Orden() {
    }

    @Override
    public String toString() {
        return "Orden{" +
                "id=" + id +
                ", cliente=" + cliente +
                ", suc=" + suc +
                ", fecha=" + fecha +
                ", montoTotal=" + montoTotal +
                ", subTotal=" + subTotal +
                ", Detalles=" + detalleString(this.detalle) +
                '}';
    }

    private String detalleString(List<DetalleOrden> detalle) {
        String cad = "";
        for (DetalleOrden d : detalle) {
            cad += " " + d + "\\n";
        }
        return cad;
    }
}
