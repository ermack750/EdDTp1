package Ej4;

public class Herramienta {
    private String codigo;
    private String nombre;
    private int cantidad;
    private double precioUnitario;
    private String tipo;

    // Constructor parametrizado que inicializa todos los atributos
    public Herramienta(String codigo, String nombre, int cantidad, double precioUnitario, String tipo) {
        this.codigo = codigo;
        this.nombre = nombre;
        if (cantidad > 0) {
            this.cantidad = cantidad;
        } else {
            System.out.println("La cantidad debe ser un número positivo. Se establece en 1 por defecto.");
            this.cantidad = 1;
        }
        if (precioUnitario > 0) {
            this.precioUnitario = precioUnitario;
        } else {
            System.out.println("El precio unitario debe ser mayor que cero. Se establece en 1.0 por defecto.");
            this.precioUnitario = 1.0;
        }
        this.tipo = tipo;
    }

    // Constructor parametrizado que inicializa código, nombre y precio unitario
    public Herramienta(String codigo, String nombre, double precioUnitario) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidad = 0; // Por defecto la cantidad es 0
        if (precioUnitario > 0) {
            this.precioUnitario = precioUnitario;
        } else {
            System.out.println("El precio unitario debe ser mayor que cero. Se establece en 1.0 por defecto.");
            this.precioUnitario = 1.0;
        }
        this.tipo = "Desconocido"; // Tipo por defecto
    }

    // Getter para 'codigo'
    public String getCodigo() {
        return codigo;
    }

    // Método para calcular el valor total de la herramienta en el inventario
    public double calcularValorTotal() {
        return cantidad * precioUnitario;
    }

    // Método para entregar una cantidad específica de una herramienta
    public boolean entregarHerramienta(int cantidadAEntregar) {
        if (cantidadAEntregar > 0 && cantidadAEntregar <= cantidad) {
            cantidad -= cantidadAEntregar;
            return true;
        } else {
            System.out.println("Cantidad a entregar no válida o no hay suficiente stock.");
            return false;
        }
    }

    // Método para mostrar nombre y precio de herramientas de un tipo específico
    public static void mostrarHerramientasPorTipo(Herramienta[] herramientas, String tipo) {
        for (Herramienta herramienta : herramientas) {
            if (herramienta.tipo.equalsIgnoreCase(tipo)) {
                System.out.println("Nombre: " + herramienta.nombre + ", Precio: " + herramienta.precioUnitario);
            }
        }
    }

    // Método para mostrar todos los datos de la herramienta
    public void mostrarInformacion() {
        System.out.println("Código: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio Unitario: " + precioUnitario);
        System.out.println("Tipo: " + tipo);
    }
}
