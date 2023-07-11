import java.text.NumberFormat;

public class Manager extends Empleado {
    private String departamento;
    private boolean puedeDespedir;

    // Constructor
    public Manager(String nombre, String idDeEmpleado, double salario, String departamento, boolean puedeDespedir) {
        // super() es una palabra reservada que se usa para llamar al constructor de la clase padre
        super(nombre, idDeEmpleado, salario);
        this.departamento = departamento;
        this.puedeDespedir = puedeDespedir;
    }

    // Getters y setters
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public boolean getPuedeDespedir() {
        return puedeDespedir;
    }

    public void setPuedeDespedir(String respuesta) {
        if (respuesta.equalsIgnoreCase("si")) {
            this.puedeDespedir = true;
        } else if (respuesta.equalsIgnoreCase("no")) {
            this.puedeDespedir = false;
        } else {
            throw new IllegalArgumentException("Respuesta inválida. Por favor, ingrese 'si' o 'no'.");
        }
    }


    // Método para saber si el manager puede despedir o no
    public void hacerDespidos() {
        if (puedeDespedir) {
            System.out.println("El manager puede despedir");
        } else {
            System.out.println("El manager no puede despedir");
        }
    }

    // Imprimir datos del manager
    public void imprimirDatos() {
        System.out.println("Datos del Manager:");
        System.out.println();
        System.out.println("Nombre: " + getNombre());
        System.out.println("ID de Empleado: " + getIdDeEmpleado());
        // Formatear el salario para que se vea como moneda
        NumberFormat formatoDeMoneda = NumberFormat.getCurrencyInstance();
        String salarioFormateado = formatoDeMoneda.format(getSalario());
        System.out.println("Salario: " + salarioFormateado);
        System.out.println("Departamento: " + departamento);
        hacerDespidos();

    }

}
