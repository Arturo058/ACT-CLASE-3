package scr;
import java.util.ArrayList;

public class Inventario {
    private ArrayList<Producto> productos;

    public Inventario() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(String nombre, double precio) {
        Producto nuevo = new Producto(nombre, precio);
        productos.add(nuevo);
    }

    public void mostrarProductos() {
        if (productos.isEmpty()) {
            System.out.println("Inventario vacío.");
        } else {
            for (Producto p : productos) {
                System.out.println(p);
            }
        }
    }
}

