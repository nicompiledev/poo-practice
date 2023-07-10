import java.util.Scanner;

public class Estudiante extends Persona {
    private String idDeEstudiante;
    private double calificacion;

    // Constructor
    public Estudiante(String nombre, int edad, String direccion, String idDeEstudiante, double calificacion) {
        // Llamada al constructor de la clase base
        super(nombre, edad, direccion);
        this.idDeEstudiante = idDeEstudiante;
        setCalificacion(calificacion);
    }

    // Getters y setters
    public String getIdDeEstudiante() {
        return idDeEstudiante;
    }

    public void setIdDeEstudiante(String idDeEstudiante) {
        this.idDeEstudiante = idDeEstudiante;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        if (calificacion >= 0.0 && calificacion <= 5.0) {
            this.calificacion = calificacion;
        } else {
            Scanner scanner = new Scanner(System.in);
            do {
                System.out.println("Calificación inválida. Por favor ingrese un valor entre 0.0 y 5.0");
                calificacion = scanner.nextDouble();
            } while (calificacion < 0.0  || calificacion > 5.0);
            this.calificacion = calificacion;
        }
    }

    // Método para saber si el estudiante aprobó o no
    public void aprobo() {
        if (calificacion >= 3.0) {
            System.out.println("El estudiante aprobó");
        } else {
            System.out.println("El estudiante reprobó");
        }
    }

    // Imprimir datos del estudiante
    public void imprimirDatos() {
        System.out.println("Datos del Estudiante:");
        System.out.println();
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Dirección: " + getDireccion());
        System.out.println("ID de Estudiante: " + idDeEstudiante);
        System.out.println("Calificación: " + calificacion);
        aprobo();
    }
}
