package model;

public class Pizza extends Producto {

    private Integer id;
    private String ingredientes;
    private TAMANO_PIZZA tamano;
    private TIPO_BORDE tipoBorde;

    public Pizza(Integer id, String ingredientes
            , TAMANO_PIZZA tamano
            , TIPO_BORDE tipoBorde) {
        this.id = id;
        this.ingredientes = ingredientes;
        this.tamano = tamano;
        this.tipoBorde = tipoBorde;
    }

    public Pizza() {
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "id=" + id +
                ", ingredientes='" + ingredientes + '\'' +
                ", tamano=" + tamano +
                ", tipoBorde=" + tipoBorde +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public TAMANO_PIZZA getTamano() {
        return tamano;
    }

    public void setTamano(TAMANO_PIZZA tamano) {
        this.tamano = tamano;
    }

    public TIPO_BORDE getTipoBorde() {
        return tipoBorde;
    }

    public void setTipoBorde(TIPO_BORDE tipoBorde) {
        this.tipoBorde = tipoBorde;
    }


}
