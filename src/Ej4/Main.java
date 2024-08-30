package Ej4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array para almacenar las herramientas
        Herramienta[] herramientas = new Herramienta[3];

        // Registro de tres herramientas con datos ingresados por el usuario
        for (int i = 0; i < herramientas.length; i++) {
            System.out.println("Ingrese los datos para la herramienta " + (i + 1) + ":");

            System.out.print("Código: ");
            String codigo = scanner.nextLine();

            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Cantidad: ");
            int cantidad = scanner.nextInt();

            System.out.print("Precio Unitario: ");
            double precioUnitario = scanner.nextDouble();
            scanner.nextLine(); // Consume el salto de línea

            System.out.print("Tipo (Eléctrica, Mecánica, Manual, etc.): ");
            String tipo = scanner.nextLine();

            herramientas[i] = new Herramienta(codigo, nombre, cantidad, precioUnitario, tipo);
        }

        // Menú de opciones
        int opcion;
        do {
            System.out.println("\nMenú de Opciones:");
            System.out.println("1. Calcular el valor total del inventario");
            System.out.println("2. Vender herramienta del inventario");
            System.out.println("3. Mostrar herramientas por tipo");
            System.out.println("4. Mostrar información de todas las herramientas");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consume el salto de línea

            switch (opcion) {
                case 1:
                    // Calcular el valor total del inventario
                    double valorTotalInventario = 0;
                    for (Herramienta herramienta : herramientas) {
                        valorTotalInventario += herramienta.calcularValorTotal();
                    }
                    System.out.println("Valor total del inventario: " + valorTotalInventario);
                    break;
                case 2:
                    // Vender herramienta del inventario
                    System.out.print("Ingrese el código de la herramienta a vender: ");
                    String codigo = scanner.nextLine();
                    System.out.print("Ingrese la cantidad a vender: ");
                    int cantidadAVender = scanner.nextInt();
                    scanner.nextLine(); // Consume el salto de línea

                    boolean herramientaEncontrada = false;
                    for (Herramienta herramienta : herramientas) {
                        if (herramienta != null && herramienta.getCodigo().equals(codigo)) {
                            herramientaEncontrada = true;
                            herramienta.entregarHerramienta(cantidadAVender);
                            break;
                        }
                    }

                    if (!herramientaEncontrada) {
                        System.out.println("Herramienta no encontrada.");
                    }
                    break;
                case 3:
                    // Mostrar herramientas por tipo
                    System.out.print("Ingrese el tipo de herramientas a mostrar: ");
                    String tipo = scanner.nextLine();
                    Herramienta.mostrarHerramientasPorTipo(herramientas, tipo);
                    break;
                case 4:
                    // Mostrar información de todas las herramientas
                    for (Herramienta herramienta : herramientas) {
                        herramienta.mostrarInformacion();
                        System.out.println("----------------------");
                    }
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción del menú.");
            }
        } while (opcion != 5);

        scanner.close();
    }
}

