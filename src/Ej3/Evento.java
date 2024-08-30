package Ej3;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Evento {
    private String nombre;
    private String descripcion;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    // Constructor predeterminado
    public Evento() {
        this.nombre = "Sin nombre";
        this.descripcion = "Sin descripción";
        this.fechaInicio = LocalDate.now();
        this.fechaFin = this.fechaInicio.plusDays(7);
    }

    // Constructor parametrizado
    public Evento(String nombre, String descripcion, LocalDate fechaInicio, LocalDate fechaFin) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        setFechas(fechaInicio, fechaFin);
    }

    // Método auxiliar para validar y establecer fechas
    private void setFechas(LocalDate fechaInicio, LocalDate fechaFin) {
        LocalDate hoy = LocalDate.now();
        if (fechaInicio.isBefore(fechaFin) && !fechaInicio.isBefore(hoy) && fechaInicio.isBefore(hoy.plusDays(30))) {
            this.fechaInicio = fechaInicio;
            this.fechaFin = fechaFin;
        } else {
            System.out.println("Fechas no válidas, ajustando a predeterminadas.");
            this.fechaInicio = hoy;
            this.fechaFin = hoy.plusDays(7);
        }
    }

    // Método para mostrar la información del evento
    public void mostrarInformacion() {
        System.out.println("Nombre del Evento: " + nombre);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Fecha de Inicio: " + fechaInicio);
        System.out.println("Fecha de Fin: " + fechaFin);
    }

    // Método para calcular la duración del evento en días
    public long calcularDuracionEnDias() {
        return ChronoUnit.DAYS.between(fechaInicio, fechaFin);
    }

    // Método para determinar si el evento está en curso en la fecha actual
    public boolean estaEnCurso() {
        LocalDate hoy = LocalDate.now();
        return (hoy.isAfter(fechaInicio) || hoy.isEqual(fechaInicio)) && (hoy.isBefore(fechaFin) || hoy.isEqual(fechaFin));
    }

    // Método para calcular la cantidad de días restantes hasta el inicio del evento
    public long diasHastaInicio() {
        LocalDate hoy = LocalDate.now();
        return ChronoUnit.DAYS.between(hoy, fechaInicio);
    }

    // Método para calcular la cantidad de días transcurridos desde el inicio del evento
    public long diasDesdeInicio() {
        LocalDate hoy = LocalDate.now();
        return ChronoUnit.DAYS.between(fechaInicio, hoy);
    }
}