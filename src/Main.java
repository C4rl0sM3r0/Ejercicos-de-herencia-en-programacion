import Vehiculo.Auto;
import Vehiculo.Moto;
import empleado.empleado;
import empleado.Gerente;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!\n");

        // Empleados
        empleado andres = new empleado("Andres Arana", 1279.078);
        andres.mostrarDatos();

        System.out.println();

        Gerente maria = new Gerente("María de la Cruz", 2580.00, "Talento humano");
        maria.mostrarDatos();

        System.out.println();

        // Vehículos
        Auto miAuto = new Auto("Toyota", 2020, 4);
        miAuto.mostrarDatos();
        miAuto.encender();
        miAuto.encenderAireAcondicionado();

        System.out.println();

        Moto miMoto = new Moto("Yamaha", 2018, true);
        miMoto.mostrarDatos();
        miMoto.encender();
        miMoto.hacerCaballito();
    }
}

// 1)¿Por qué el método encender() de Auto y Moto reemplaza el de Vehiculo?
// Porque en Java, cuando una subclase define un método con el mismo nombre, tipo de retorno y parámetros
// que uno de su superclase, se produce sobrescritura (override). Esto permite que el objeto use su versión
// especializada del método, incluso si se declara como tipo Vehiculo. Este comportamiento se llama polimorfismo dinámico.

// 2)¿Qué sucede si quitamos la anotación @Override?
// El código aún compila y ejecuta si la firma del método coincide exactamente con la de la superclase.
// Sin embargo, si hay un error en la firma, no se sobrescribe el método original y el compilador no avisa.
// Usar @Override es una buena práctica porque permite al compilador verificar que realmente estás sobrescribiendo.

// 3)¿Qué modificadores de acceso permiten la herencia sin problemas?
// public: permite herencia y acceso desde cualquier clase.
// protected: permite herencia y acceso desde subclases o clases del mismo paquete.
// default (sin modificador): permite herencia solo dentro del mismo paquete.
// private: no permite herencia ni acceso desde subclases.
// Recomendación: usar protected para atributos y métodos que deben ser accesibles desde subclases.


// 4)¿Podríamos tener una clase Camion que herede de Vehiculo con su propio método encender()?
// Sí. Una subclase como Camion puede sobrescribir el método encender() para definir su propio comportamiento.
// Esto es válido y útil cuando el tipo de vehículo requiere una lógica distinta al encenderse.


