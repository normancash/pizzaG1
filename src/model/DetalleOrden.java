package model;

public class DetalleOrden {

    private Integer id;
    private Pizza pizza;
    private Extra extra;
    private double subTotal;
    private int cantidad;

    public Integer getId() {
        return id;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    public Extra getExtra() {
        return extra;
    }

    public void setExtra(Extra extra) {
        this.extra = extra;
    }



    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "DetalleOrden{" +
                "id=" + id +
                ", pizza=" + pizza +
                ", extra=" + extra +
                ", subTotal=" + subTotal +
                ", cantidad=" + cantidad +
                '}';
    }

    public DetalleOrden(Integer id, Pizza pizza
            , Extra extra, int cantidad) {
        this.id = id;
        this.pizza = pizza;
        this.extra = extra;
        this.subTotal = subTotal;
        this.cantidad = cantidad;
        if (pizza != null) {
            this.subTotal = this.cantidad * this.pizza.precio;
        }
        if (extra != null) {
            this.subTotal = this.cantidad * this.extra.precio;
        }
    }

    public DetalleOrden(){}
}
