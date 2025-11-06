package empleado;

public class empleado {
    //atributos prottegidos
    protected String nombre;
    protected double salario;

    // contructor parametrizado
    public empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    //metodos
    public void mostrarDatos()
    {
        System.out.printf("\nNombre del empleado %s", this.nombre);
        System.out.printf("\nSu salario e %2f", this.salario);
    }


}
