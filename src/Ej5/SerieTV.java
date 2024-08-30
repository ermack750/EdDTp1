package Ej5;

public class SerieTV extends ContenidoMultimedia {
    private int temporadas;
    private String genero;

    // Constructor con argumentos
    public SerieTV(String titulo, String director, int año, int duracion, boolean disponible, int temporadas, String genero) {
        super(titulo, director, año, duracion, disponible); // Llamada explícita al constructor de la clase padre
        this.temporadas = temporadas;
        this.genero = genero;
    }

    // Método para mostrar la información de la serie de TV
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion(); // Llamada al método de la clase padre
        System.out.println("Temporadas: " + temporadas);
        System.out.println("Género: " + genero);
    }
}

