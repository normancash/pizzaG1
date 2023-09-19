import model.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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


        List<DetalleOrden> detalles  = new ArrayList<>();
        DetalleOrden detalleOrden0 = new DetalleOrden(1,p1,null,1);
        DetalleOrden detalleOrden1 = new DetalleOrden(1,p1,null,1);
        DetalleOrden detalleOrden2 = new DetalleOrden(1,p1,null,1);
        detalles.add(detalleOrden0);
        detalles.add(detalleOrden1);
        detalles.add(detalleOrden2);
        //Orden
        Orden orden = new Orden(1,c1,suc1,new Date()
                ,0.00,0.00,detalles);
        System.out.println(orden);
    }
}