package Ej1;

public class Vehiculo {
    private String marca;
    private String modelo;
    private String tipoMotor;

    // Constructor predeterminado
    public Vehiculo() {
        this.marca = "Desconocida";
        this.modelo = "Sin modelo";
        this.tipoMotor = "Desconocido";
    }

    // Constructor con argumentos
    public Vehiculo(String marca, String modelo, String tipoMotor) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipoMotor = tipoMotor;
    }

    // Método toString()
    @Override
    public String toString() {
        return "Marca: " + marca + ", Modelo: " + modelo + ", Tipo de Motor: " + tipoMotor;
    }

    // Getters para los atributos
    public String getMarca() {
        return marca;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }
}
