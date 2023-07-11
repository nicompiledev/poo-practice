import java.util.Scanner;

public class Empleado {
    private String nombre;
    private String idDeEmpleado;
    private double salario;

    // Constructor
    public Empleado(String nombre, String idDeEmpleado, double salario) {
        this.nombre = nombre;
        this.idDeEmpleado = idDeEmpleado;
        setSalario(salario);
    }

    // Getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getIdDeEmpleado() {
        return idDeEmpleado;
    }

    public void setIdDeEmpleado(String idDeEmpleado) {
        this.idDeEmpleado = idDeEmpleado;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario >= 0.0) {
            this.salario = salario;
        } else {
            Scanner scanner = new Scanner(System.in);
            do {
                System.out.println("Salario inválido. Por favor ingrese un valor mayor o igual a 0.0");
                salario = scanner.nextDouble();
            } while (salario < 0.0);
            this.salario = salario;
        }
    }



    // Imprimir datos del empleado
    public void imprimirDatos() {
        System.out.println("Datos del Empleado:");
        System.out.println();
        System.out.println("Nombre: " + nombre);
        System.out.println("ID de Empleado: " + idDeEmpleado);
        System.out.println("Salario: " + salario);

    }
}
