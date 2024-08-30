package Ej6;

public class ActividadFisica {
    private String nombreCentro;
    private String nombreActividad;
    private String instructor;
    private boolean disponible;
    private String diaSemana;
    private String horaInicio;

    // Constructor con argumentos
    public ActividadFisica(String nombreCentro, String nombreActividad, String instructor, boolean disponible, String diaSemana, String horaInicio) {
        this.nombreCentro = nombreCentro;
        this.nombreActividad = nombreActividad;
        this.instructor = instructor;
        this.disponible = disponible;
        this.diaSemana = diaSemana;
        this.horaInicio = horaInicio;
    }

    // Método para mostrar todos los datos de la actividad
    public void mostrarDatos() {
        System.out.println("Nombre del Centro: " + nombreCentro);
        System.out.println("Nombre de la Actividad: " + nombreActividad);
        System.out.println("Instructor: " + instructor);
        System.out.println("Disponible: " + (disponible ? "Sí" : "No"));
        System.out.println("Día de la Semana: " + diaSemana);
        System.out.println("Hora de Inicio: " + horaInicio);
    }

    // Método para verificar si una actividad está disponible
    public boolean estaDisponible() {
        return disponible;
    }

    // Getters
    public String getNombreCentro() {
        return nombreCentro;
    }

    public String getInstructor() {
        return instructor;
    }

    public String getNombreActividad() {
        return nombreActividad;
    }
}
