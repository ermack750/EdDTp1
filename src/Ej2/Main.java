package Ej2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear un artículo con datos ingresados por el usuario
        System.out.println("Ingrese los datos del artículo:");
        String codigo = ingresarDato(scanner, "código");
        String nombre = ingresarDato(scanner, "nombre");
        double precio = ingresarDouble(scanner, "precio");
        int cantidad = ingresarEntero(scanner, "cantidad inicial");

        ArticuloDeLibreria articulo = new ArticuloDeLibreria(codigo, nombre, precio, cantidad);

        // Depositar una cantidad específica en el stock
        int cantidadDepositar = ingresarEntero(scanner, "cantidad a depositar en stock");
        articulo.depositarEnStock(cantidadDepositar);

        // Retirar una cantidad específica del stock
        int cantidadRetirar = ingresarEntero(scanner, "cantidad a retirar del stock");
        articulo.retirarDeStock(cantidadRetirar);

        // Mostrar la información del artículo
        System.out.println("\nInformación del artículo:");
        System.out.println(articulo);
    }

    // Método para ingresar datos de tipo String con validación
    private static String ingresarDato(Scanner scanner, String dato) {
        System.out.print("Ingrese " + dato + ": ");
        return scanner.nextLine();
    }

    // Método para ingresar datos de tipo double con validación
    private static double ingresarDouble(Scanner scanner, String dato) {
        double valor;
        while (true) {
            System.out.print("Ingrese " + dato + ": ");
            try {
                valor = Double.parseDouble(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor ingrese un número decimal.");
            }
        }
        return valor;
    }

    // Método para ingresar datos de tipo entero con validación
    private static int ingresarEntero(Scanner scanner, String dato) {
        int valor;
        while (true) {
            System.out.print("Ingrese " + dato + ": ");
            try {
                valor = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor ingrese un número entero.");
            }
        }
        return valor;
    }
}
