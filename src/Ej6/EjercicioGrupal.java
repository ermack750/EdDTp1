package Ej6;

public class EjercicioGrupal extends ActividadFisica {
    private String nivelDificultad;
    private int cantidadParticipantes;
    private String diaFinalizacionCiclo;

    // Constructor con validaciones
    public EjercicioGrupal(String nombreCentro, String nombreActividad, String instructor, boolean disponible, String diaSemana, String horaInicio, String nivelDificultad, int cantidadParticipantes, String diaFinalizacionCiclo) {
        super(nombreCentro, nombreActividad, instructor, disponible, diaSemana, horaInicio);
        if (nivelDificultad == null || nivelDificultad.isEmpty()) {
            throw new IllegalArgumentException("El nivel de dificultad no puede estar vacío.");
        }
        if (cantidadParticipantes <= 0) {
            throw new IllegalArgumentException("La cantidad de participantes debe ser positiva.");
        }
        this.nivelDificultad = nivelDificultad;
        this.cantidadParticipantes = cantidadParticipantes;
        this.diaFinalizacionCiclo = diaFinalizacionCiclo;
    }

    public void mostrarInfoEjercicioGrupal() {
        System.out.println("Nombre del Centro: " + getNombreCentro());
        System.out.println("Nombre del Instructor: " + getInstructor());
        System.out.println("Cantidad de Participantes: " + cantidadParticipantes);
    }
}
