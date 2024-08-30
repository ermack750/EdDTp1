package Ej1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Vehiculo> vehiculos = new ArrayList<>();

        // Solicitar ingreso de datos para tres vehículos
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese los datos del vehículo " + (i + 1) + ":");
            String marca = ingresarDato(scanner, "marca");
            String modelo = ingresarDato(scanner, "modelo");
            String tipoMotor = ingresarTipoMotor(scanner);

            Vehiculo vehiculo = new Vehiculo(marca, modelo, tipoMotor);
            vehiculos.add(vehiculo);
        }

        // Mostrar información de todos los vehículos
        System.out.println("\nInformación de los vehículos creados:");
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo);
        }

        // Mostrar vehículos de una marca específica
        System.out.println("\nIngrese la marca para mostrar los vehículos correspondientes:");
        String marcaBuscada = scanner.nextLine();
        System.out.println("Vehículos de la marca " + marcaBuscada + ":");
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getMarca().equalsIgnoreCase(marcaBuscada)) {
                System.out.println(vehiculo);
            }
        }

        // Contar vehículos según tipo de motor
        int contadorNaftero = 0;
        int contadorDiesel = 0;
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getTipoMotor().equalsIgnoreCase("naftero")) {
                contadorNaftero++;
            } else if (vehiculo.getTipoMotor().equalsIgnoreCase("diesel")) {
                contadorDiesel++;
            }
        }

        System.out.println("\nCantidad de vehículos nafteros: " + contadorNaftero);
        System.out.println("Cantidad de vehículos diesel: " + contadorDiesel);
    }

    // Método para ingresar datos con validación
    private static String ingresarDato(Scanner scanner, String dato) {
        System.out.print("Ingrese " + dato + ": ");
        return scanner.nextLine();
    }

    // Método para ingresar tipo de motor con validación
    private static String ingresarTipoMotor(Scanner scanner) {
        String tipoMotor;
        while (true) {
            System.out.print("Ingrese tipo de motor (naftero/diesel): ");
            tipoMotor = scanner.nextLine().toLowerCase();
            if (tipoMotor.equals("naftero") || tipoMotor.equals("diesel")) {
                break;
            } else {
                System.out.println("Tipo de motor inválido. Por favor ingrese 'naftero' o 'diesel'.");
            }
        }
        return tipoMotor;
    }
}

