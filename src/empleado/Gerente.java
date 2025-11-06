package empleado;

public class Gerente extends empleado{
    private  String departamento;

    //constructor
    public Gerente(String nombre, double salario, String departamento) {
        super(nombre, salario);
        this.departamento = departamento;
    }
    @Override
    public void  mostrarDatos(){
        super.mostrarDatos();
        System.out.printf("\nEsta a acargo del deparatamento %s", this.departamento);
    }
}
