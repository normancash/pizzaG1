import model.*;

public class Main {
    public static void main(String[] args) {
        Sucursal suc = new Sucursal(1, "Matagalpa","Matagalpa");
        Sucursal suc1 = new Sucursal(2,"Managua","Managua");
        //Producto pizza
        Pizza p1 = new Pizza(300,1,"Hawaiana"
                , TAMANO_PIZZA.GRANDE, TIPO_BORDE.BACON);
        //Cliente
        Cliente c1 = new Cliente(1,"Norman","Jose","Cash","Arcia","Managua"
                        ,"923432234");
        //DetalleOrden detalleOrden = new DetalleOrden(1,p1,null,);

    }
}