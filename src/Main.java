import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter your name: ");
//        String name = scanner.nextLine();
//
//        LocalDate today = LocalDate.now();
//        LocalTime time = LocalTime.now();
//
//        // create a formatter
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
//
//        // format the time
//        String formattedTime = time.format(formatter);
//
//        System.out.println("Hello "+ name +", today's Local date : " + today + ", and time is: " + formattedTime);


//        // Create an object of the derived class (Dog)
//        Dog dog = new Dog("Max", "Labrador Retriever");
//
//        // Call methods from the base class (Animal)
//        dog.showInformation(); // Inherited from Animal
//
//        // Call methods specific to the derived class (Dog)
//        dog.makeSound();
//        System.out.println(
//                dog.getClass().getSimpleName() + " is a subclass of " + dog.getClass().getSuperclass().getSimpleName()
//        );

//

//    // pedir datos del estudiante por consola
//
//    Scanner scanner = new Scanner(System.in);
//
//    System.out.print("Ingrese el nombre del estudiante: ");
//    String nombre = scanner.nextLine();
//
//    System.out.print("Ingrese la edad del estudiante: ");
//    int edad = scanner.nextInt();
//    scanner.nextLine(); // Consumir el salto de línea
//
//    System.out.print("Ingrese la dirección del estudiante: ");
//    String direccion = scanner.nextLine();
//
//    System.out.print("Ingrese el ID del estudiante: ");
//    String idDeEstudiante = scanner.nextLine();
//
//    System.out.print("Ingrese la calificación del estudiante: ");
//    double calificacion = scanner.nextDouble();
//
//    // crear instancia de la clase Estudiante
//    Estudiante estudiante = new Estudiante(nombre, edad, direccion, idDeEstudiante, calificacion);
//
//    // imprimir datos del estudiante
//    estudiante.imprimirDatos();
//
//
//    // cerrar el scanner para evitar fugas de memoria
//        scanner.close();
//
//    }

//        // pedir datos del manager por consola
//
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Ingrese el nombre del manager: ");
//        String nombre = scanner.nextLine();
//
//        System.out.print("Ingrese el id del manager: ");
//        String idEmpleado = scanner.nextLine();
//
//        System.out.print("Ingrese el salario del manager: ");
//        double salario = scanner.nextDouble();
//        scanner.nextLine(); // Consumir el salto de línea
//
//        System.out.print("Ingrese el departamento al que pertenece el manager: ");
//        String departamento = scanner.nextLine();
//
//
//        System.out.print("Indique si el manager puede despedir o no: ");
//        String respuesta = scanner.nextLine();
//        boolean puedeDespedir = respuesta.equalsIgnoreCase("si");
//
//        // crear instancia de la clase Manager
//        Manager manager = new Manager(nombre, idEmpleado, salario, departamento, puedeDespedir);
//
//        // imprimir datos del manager
//        manager.imprimirDatos();
//
//    }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una palabra para imprimirla letra por letra: ");

        String palabra = scanner.nextLine();

        // usando for each
        char[] letras = palabra.toCharArray();
        for (char letra : letras) {
            System.out.println(letra);
        }

        // usando for loop
        for (int i = 0; i < palabra.length(); i++) {
            System.out.println(palabra.charAt(i));
        }


    }



}





