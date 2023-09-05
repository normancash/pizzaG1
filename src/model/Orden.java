package model;

import java.util.Date;

public class Orden {

    private Integer id;
    private Cliente cliente;
    private Sucursal suc;
    private Date fecha;

    private double montoTotal;
    private double subTotal;

    private DetalleOrden detalle;

}
