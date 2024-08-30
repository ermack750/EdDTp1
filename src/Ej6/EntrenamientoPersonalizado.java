package Ej6;

public class EntrenamientoPersonalizado extends ActividadFisica {
    private int duracionHoras;
    private String objetivosEntrenamiento;
    private String rutinaPersonalizada;

    // Constructor con validaciones
    public EntrenamientoPersonalizado(String nombreCentro, String nombreActividad, String instructor, boolean disponible, String diaSemana, String horaInicio, int duracionHoras, String objetivosEntrenamiento, String rutinaPersonalizada) {
        super(nombreCentro, nombreActividad, instructor, disponible, diaSemana, horaInicio);
        if (duracionHoras <= 0) {
            throw new IllegalArgumentException("La duración debe ser positiva.");
        }
        if (objetivosEntrenamiento == null || objetivosEntrenamiento.isEmpty()) {
            throw new IllegalArgumentException("Los objetivos del entrenamiento no pueden estar vacíos.");
        }
        if (rutinaPersonalizada == null || rutinaPersonalizada.isEmpty()) {
            throw new IllegalArgumentException("La rutina personalizada no puede estar vacía.");
        }
        this.duracionHoras = duracionHoras;
        this.objetivosEntrenamiento = objetivosEntrenamiento;
        this.rutinaPersonalizada = rutinaPersonalizada;
    }

    public void mostrarEntrenamiento() {
        super.mostrarDatos();
        System.out.println("Duración en Horas: " + duracionHoras);
        System.out.println("Objetivos del Entrenamiento: " + objetivosEntrenamiento);
        System.out.println("Rutina Personalizada: " + rutinaPersonalizada);
    }
}
