package model;

public class DetalleOrden {

    private Integer id;
    private Pizza pizza;
    private Extra extra;
    private double precio;
    private int cantidad;

    public Integer getId() {
        return id;
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
                ", precio=" + precio +
                ", cantidad=" + cantidad +
                '}';
    }

    public DetalleOrden(Integer id, Pizza pizza
            , Extra extra, int cantidad) {
        this.id = id;
        this.pizza = pizza;
        this.extra = extra;
        this.precio = precio;
        this.cantidad = cantidad;
        if (pizza != null) {
            this.precio = this.cantidad * this.pizza.precio;
        }
        if (extra != null) {
            this.precio = this.cantidad * this.extra.precio;
        }
    }
}
