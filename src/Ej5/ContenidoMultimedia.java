package Ej5;

public class ContenidoMultimedia {
    private String titulo;
    private String director;
    private int año;
    private int duracion;
    private boolean disponible;

    // Constructor con argumentos
    public ContenidoMultimedia(String titulo, String director, int año, int duracion, boolean disponible) {
        this.titulo = titulo;
        this.director = director;
        this.año = año;
        this.duracion = duracion;
        this.disponible = disponible;
    }

    // Método para mostrar la información del contenido multimedia
    public void mostrarInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Director: " + director);
        System.out.println("Año: " + año);
        System.out.println("Duración: " + duracion + " minutos");
        System.out.println("Disponible para alquiler: " + (disponible ? "Sí" : "No"));
    }

    // Método para verificar si el contenido multimedia está disponible para alquiler
    public boolean estaDisponibleParaAlquiler() {
        return disponible;
    }

    // Getter para 'titulo'
    public String getTitulo() {
        return titulo;
    }
}

