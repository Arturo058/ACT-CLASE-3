package scr;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- MENÚ DE OPERACIONES ---");
            System.out.println("1. Insertar al inicio");
            System.out.println("2. Insertar al final");
            System.out.println("3. Eliminar un valor");
            System.out.println("4. Buscar un valor");
            System.out.println("5. Mostrar lista");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Valor a insertar al inicio: ");
                    lista.insertarInicio(scanner.nextInt());
                    break;
                case 2:
                    System.out.print("Valor a insertar al final: ");
                    lista.insertarFinal(scanner.nextInt());
                    break;
                case 3:
                    System.out.print("Valor a eliminar: ");
                    lista.eliminar(scanner.nextInt());
                    break;
                case 4:
                    System.out.print("Valor a buscar: ");
                    int valor = scanner.nextInt();
                    System.out.println(lista.buscar(valor) ? "Valor encontrado." : "Valor no encontrado.");
                    break;
                case 5:
                    lista.mostrar();
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 6);

        scanner.close();
    }
}
