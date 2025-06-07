package scr;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimuladorPila pila = new SimuladorPila();
        SimuladorCola cola = new SimuladorCola();

        int opcion;

        do {
            System.out.println("\n===== SIMULADOR =====");
            System.out.println("1. Abrir archivo (Pila)");
            System.out.println("2. Cerrar archivo (Pila)");
            System.out.println("3. Ver archivos abiertos (Pila)");
            System.out.println("4. Agregar cliente (Cola)");
            System.out.println("5. Atender cliente (Cola)");
            System.out.println("6. Ver clientes en fila (Cola)");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del archivo a abrir: ");
                    String archivo = scanner.nextLine();
                    pila.abrirArchivo(archivo);
                    break;
                case 2:
                    pila.cerrarArchivo();
                    break;
                case 3:
                    pila.mostrarArchivos();
                    break;
                case 4:
                    System.out.print("Nombre del cliente: ");
                    String cliente = scanner.nextLine();
                    cola.agregarCliente(cliente);
                    break;
                case 5:
                    cola.atenderCliente();
                    break;
                case 6:
                    cola.mostrarClientes();
                    break;
                case 0:
                    System.out.println("Saliendo del simulador...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 0);

        scanner.close();
    }
}
