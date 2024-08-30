package Ej2;

public class ArticuloDeLibreria {
    private String codigo;
    private String nombre;
    private double precio;
    private int cantidad;

    // Constructor predeterminado
    public ArticuloDeLibreria() {
        this.precio = 0;
        this.cantidad = 0;
    }

    // Constructor con parámetros
    public ArticuloDeLibreria(String codigo, String nombre, double precio, int cantidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    // Método para depositar en el stock
    public void depositarEnStock(int cantidad) {
        if (cantidad > 0) {
            this.cantidad += cantidad;
            System.out.println("Se han agregado " + cantidad + " unidades al stock.");
        } else {
            System.out.println("La cantidad a depositar debe ser mayor que cero.");
        }
    }

    // Método para retirar del stock
    public void retirarDeStock(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("La cantidad a retirar debe ser mayor que cero.");
        } else if (cantidad > this.cantidad) {
            System.out.println("Error: No se puede retirar una cantidad mayor a la disponible en el stock.");
        } else {
            this.cantidad -= cantidad;
            System.out.println("Se han retirado " + cantidad + " unidades del stock.");
        }
    }

    // Método toString para mostrar información del artículo
    @Override
    public String toString() {
        return "Código: " + codigo + ", Nombre: " + nombre + ", Precio: $" + precio + ", Cantidad en stock: " + cantidad;
    }

    // Getters y setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
