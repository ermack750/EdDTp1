package Ej6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Ingreso y validación de datos para EjercicioGrupal
        System.out.println("Ingrese los datos del Ejercicio Grupal:");
        String nombreCentro = leerCadena("Nombre del Centro: ");
        String nombreActividad = leerCadena("Nombre de la Actividad: ");
        String instructor = leerCadena("Instructor: ");
        boolean disponible = leerBoolean("Disponible (true/false): ");
        String diaSemana = leerCadena("Día de la Semana: ");
        String horaInicio = leerCadena("Hora de Inicio: ");
        String nivelDificultad = leerCadena("Nivel de Dificultad: ");
        int cantidadParticipantes = leerEnteroPositivo("Cantidad de Participantes: ");
        String diaFinalizacionCiclo = leerCadena("Día de Finalización del Ciclo: ");

        // Crear objeto EjercicioGrupal
        EjercicioGrupal ejercicioGrupal = new EjercicioGrupal(nombreCentro, nombreActividad, instructor, disponible, diaSemana, horaInicio, nivelDificultad, cantidadParticipantes, diaFinalizacionCiclo);

        // Mostrar información del Ejercicio Grupal
        ejercicioGrupal.mostrarInfoEjercicioGrupal();

        // Ingreso y validación de datos para EntrenamientoPersonalizado
        System.out.println("\nIngrese los datos del Entrenamiento Personalizado:");
        nombreCentro = leerCadena("Nombre del Centro: ");
        nombreActividad = leerCadena("Nombre de la Actividad: ");
        instructor = leerCadena("Instructor: ");
        disponible = leerBoolean("Disponible (true/false): ");
        diaSemana = leerCadena("Día de la Semana: ");
        horaInicio = leerCadena("Hora de Inicio: ");
        int duracionHoras = leerEnteroPositivo("Duración en Horas: ");
        String objetivosEntrenamiento = leerCadena("Objetivos del Entrenamiento: ");
        String rutinaPersonalizada = leerCadena("Rutina Personalizada: ");

        // Crear objeto EntrenamientoPersonalizado
        EntrenamientoPersonalizado entrenamientoPersonalizado = new EntrenamientoPersonalizado(nombreCentro, nombreActividad, instructor, disponible, diaSemana, horaInicio, duracionHoras, objetivosEntrenamiento, rutinaPersonalizada);

        // Mostrar información del Entrenamiento Personalizado
        entrenamientoPersonalizado.mostrarEntrenamiento();

        scanner.close();
    }

    // Métodos auxiliares para leer datos con validación

    private static String leerCadena(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextLine();
    }

    private static boolean leerBoolean(String mensaje) {
        while (true) {
            System.out.print(mensaje);
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("true")) {
                return true;
            } else if (input.equalsIgnoreCase("false")) {
                return false;
            } else {
                System.out.println("Entrada inválida. Debe ingresar 'true' o 'false'.");
            }
        }
    }

    private static int leerEnteroPositivo(String mensaje) {
        while (true) {
            try {
                System.out.print(mensaje);
                int numero = scanner.nextInt();
                scanner.nextLine(); // Limpiar el buffer
                if (numero > 0) {
                    return numero;
                } else {
                    System.out.println("El número debe ser positivo. Intente nuevamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Debe ingresar un número entero positivo.");
                scanner.next(); // Limpiar el buffer
            }
        }
    }
}
