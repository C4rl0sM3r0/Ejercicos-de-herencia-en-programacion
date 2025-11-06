package Vehiculo;

public class Moto extends Vehiculo {
    private boolean tieneCasco;

    public Moto(String marca, int anio, boolean tieneCasco) {
        super(marca, anio);
        this.tieneCasco = tieneCasco;
    }

    // Método específico de la moto
    public void hacerCaballito() {
        System.out.println("¡La moto está haciendo un caballito!");
    }

    // Mostrar todos los datos de la moto
    @Override
    public void mostrarDatos() {
        super.mostrarDatos(); // Muestra marca y año
        System.out.println("¿Incluye casco?: " + (tieneCasco ? "Sí" : "No"));
    }
}
