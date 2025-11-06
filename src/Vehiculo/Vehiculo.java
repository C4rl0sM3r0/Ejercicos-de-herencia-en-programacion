package Vehiculo;

public class Vehiculo {
    protected String marca;
    protected int anio;

    public Vehiculo(String marca, int anio) {
        this.marca = marca;
        this.anio = anio;
    }

    // Método para mostrar los datos del vehículo
    public void mostrarDatos() {
        System.out.println("Marca del vehículo: " + marca);
        System.out.println("Año de fabricación: " + anio);
    }

    // Método común para encender el vehículo
    public void encender() {
        System.out.println("El vehículo está encendido.");
    }
}
