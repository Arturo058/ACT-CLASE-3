package scr;
import java.util.LinkedList;
import java.util.Queue;

public class SimuladorCola {
    private Queue<String> filaClientes = new LinkedList<>();

    public void agregarCliente(String nombreCliente) {
        filaClientes.add(nombreCliente);
        System.out.println("Cliente agregado a la fila: " + nombreCliente);
    }

    public void atenderCliente() {
        if (!filaClientes.isEmpty()) {
            String clienteAtendido = filaClientes.poll();
            System.out.println("Cliente atendido: " + clienteAtendido);
        } else {
            System.out.println("No hay clientes en la fila.");
        }
    }

    public void mostrarClientes() {
        if (filaClientes.isEmpty()) {
            System.out.println("No hay clientes en la fila.");
        } else {
            System.out.println("Clientes en la fila:");
            for (String cliente : filaClientes) {
                System.out.println("- " + cliente);
            }
        }
    }
}

