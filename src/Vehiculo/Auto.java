package Vehiculo;

public class Auto extends Vehiculo {
    private int cantidadPuertas;

    public Auto(String marca, int anio, int cantidadPuertas) {
        super(marca, anio);
        this.cantidadPuertas = cantidadPuertas;
    }

    // Método específico del auto
    public void encenderAireAcondicionado() {
        System.out.println("Aire acondicionado encendido.");
    }

    // Mostrar todos los datos del auto
    @Override
    public void mostrarDatos() {
        super.mostrarDatos(); // Muestra marca y año
        System.out.println("Cantidad de puertas: " + cantidadPuertas);
    }
}
