package Ej5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Registro de Contenido Multimedia");

        // Variables para almacenar datos validados
        String titulo = "";
        String director = "";
        int año = 0;
        int duracion = 0;
        boolean disponible = false;
        int temporadas = 0;
        String genero = "";

        // Validación del título
        while (true) {
            System.out.print("Ingrese el título: ");
            titulo = scanner.nextLine();
            if (!titulo.trim().isEmpty()) {
                break;
            } else {
                System.out.println("Error: El título no puede estar vacío. Intente de nuevo.");
            }
        }

        // Validación del director
        while (true) {
            System.out.print("Ingrese el director: ");
            director = scanner.nextLine();
            if (!director.trim().isEmpty()) {
                break;
            } else {
                System.out.println("Error: El nombre del director no puede estar vacío. Intente de nuevo.");
            }
        }

        // Validación del año
        while (true) {
            System.out.print("Ingrese el año: ");
            try {
                año = scanner.nextInt();
                if (año > 1800 && año <= 2024) { // Ejemplo de rango de año válido
                    break;
                } else {
                    System.out.println("Error: Ingrese un año válido (1800-2024).");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingrese un número válido para el año.");
                scanner.next(); // Limpiar el buffer de entrada
            }
        }

        // Validación de la duración
        while (true) {
            System.out.print("Ingrese la duración en minutos: ");
            try {
                duracion = scanner.nextInt();
                if (duracion > 0) {
                    break;
                } else {
                    System.out.println("Error: La duración debe ser un número positivo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingrese un número válido para la duración.");
                scanner.next(); // Limpiar el buffer de entrada
            }
        }

        // Validación de la disponibilidad
        while (true) {
            System.out.print("¿Está disponible para alquiler? (true/false): ");
            try {
                disponible = scanner.nextBoolean();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingrese 'true' o 'false' para la disponibilidad.");
                scanner.next(); // Limpiar el buffer de entrada
            }
        }

        // Crear el objeto ContenidoMultimedia
        ContenidoMultimedia contenido = new ContenidoMultimedia(titulo, director, año, duracion, disponible);
        contenido.mostrarInformacion();

        // Crear un objeto SerieTV
        scanner.nextLine(); // Limpiar el buffer
        System.out.println("\nRegistro de Serie de TV");

        // Validación del género
        while (true) {
            System.out.print("Ingrese el género de la serie: ");
            genero = scanner.nextLine();
            if (!genero.trim().isEmpty()) {
                break;
            } else {
                System.out.println("Error: El género no puede estar vacío. Intente de nuevo.");
            }
        }

        // Validación del número de temporadas
        while (true) {
            System.out.print("Ingrese el número de temporadas: ");
            try {
                temporadas = scanner.nextInt();
                if (temporadas > 0) {
                    break;
                } else {
                    System.out.println("Error: El número de temporadas debe ser un número positivo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingrese un número válido para el número de temporadas.");
                scanner.next(); // Limpiar el buffer de entrada
            }
        }

        // Crear el objeto SerieTV
        SerieTV serie = new SerieTV(titulo, director, año, duracion, disponible, temporadas, genero);
        serie.mostrarInformacion();
    }
}
