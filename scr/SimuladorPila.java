package scr;
import java.util.Stack;

public class SimuladorPila {
    private Stack<String> pilaArchivos = new Stack<>();

    public void abrirArchivo(String nombreArchivo) {
        pilaArchivos.push(nombreArchivo);
        System.out.println("Archivo abierto: " + nombreArchivo);
    }

    public void cerrarArchivo() {
        if (!pilaArchivos.isEmpty()) {
            String archivoCerrado = pilaArchivos.pop();
            System.out.println("Archivo cerrado: " + archivoCerrado);
        } else {
            System.out.println("No hay archivos abiertos.");
        }
    }

    public void mostrarArchivos() {
        if (pilaArchivos.isEmpty()) {
            System.out.println("No hay archivos en la pila.");
        } else {
            System.out.println("Archivos abiertos:");
            for (String archivo : pilaArchivos) {
                System.out.println("- " + archivo);
            }
        }
    }
}
