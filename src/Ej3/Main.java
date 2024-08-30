package Ej3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        Evento evento;

        // Ingreso de datos del usuario
        System.out.println("Ingrese el nombre del evento:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese la descripción del evento:");
        String descripcion = scanner.nextLine();

        LocalDate fechaInicio = null;
        LocalDate fechaFin = null;

        while (true) {
            try {
                System.out.println("Ingrese la fecha de inicio del evento (yyyy-MM-dd):");
                fechaInicio = LocalDate.parse(scanner.nextLine(), dateFormatter);

                System.out.println("Ingrese la fecha de fin del evento (yyyy-MM-dd):");
                fechaFin = LocalDate.parse(scanner.nextLine(), dateFormatter);

                break;
            } catch (DateTimeParseException e) {
                System.out.println("Formato de fecha inválido. Por favor, ingrese la fecha en formato yyyy-MM-dd.");
            }
        }

        // Crear el evento con los datos ingresados
        evento = new Evento(nombre, descripcion, fechaInicio, fechaFin);

        // Menú de opciones
        int opcion;
        do {
            System.out.println("\nMenú de Opciones:");
            System.out.println("1. Mostrar información del evento");
            System.out.println("2. Calcular duración del evento en días");
            System.out.println("3. Verificar si el evento está en curso en la fecha actual");
            System.out.println("4. Calcular cantidad de días restantes hasta el inicio del evento");
            System.out.println("5. Calcular cantidad de días transcurridos desde el inicio del evento");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    evento.mostrarInformacion();
                    break;
                case 2:
                    System.out.println("Duración del evento: " + evento.calcularDuracionEnDias() + " días");
                    break;
                case 3:
                    if (evento.estaEnCurso()) {
                        System.out.println("El evento está en curso en la fecha actual.");
                    } else {
                        System.out.println("El evento no está en curso en la fecha actual.");
                    }
                    break;
                case 4:
                    System.out.println("Días restantes hasta el inicio del evento: " + evento.diasHastaInicio());
                    break;
                case 5:
                    System.out.println("Días transcurridos desde el inicio del evento: " + evento.diasDesdeInicio());
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción del menú.");
            }
        } while (opcion != 6);

        scanner.close();
    }
}
