package model;

public class Extra {

    private Integer id;
    private String nombre;

    public Extra(){}

    public Extra(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Extra{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
