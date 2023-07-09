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

        Persona persona1 = new Persona("John Doe", 30);
        Persona persona2 = new Persona("Jane Smith", 25);
        Persona persona3 = new Persona("John Doe", 30);

        // Utilizar el método toString()
        System.out.println(persona1.toString()); // Salida: Persona [nombre=John Doe, edad=30]

        // Utilizar el método equals()
        System.out.println("persona1 equals persona2: " + persona1.equals(persona2)); // Salida: false
        System.out.println("persona1 equals persona3: " + persona1.equals(persona3)); // Salida: true

        // Utilizar el método hashCode()
        System.out.println("persona1 hashCode: " + persona1.hashCode()); // Salida: hashCode único para persona1
        System.out.println("persona2 hashCode: " + persona2.hashCode()); // Salida: hashCode único para persona2




    }



}





