public class EjerciciosPOO {
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
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Ingrese una palabra para imprimirla letra por letra: ");
//
//        String palabra = scanner.nextLine();
//
//        // usando for each
//        char[] letras = palabra.toCharArray();
//        for (char letra : letras) {
//            System.out.println(letra);
//        }
//
//        // usando for loop
//        for (int i = 0; i < palabra.length(); i++) {
//            System.out.println(palabra.charAt(i));
//        }

//        // contador for loop
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Ingrese un número: ");
//        int numero = scanner.nextInt();
//
//        int suma= 0;
//
//
//        for (int i = 0; i <= numero; i++) {
//            suma += i;
//
//        }
//        System.out.println(suma);
//        scanner.close();
//
////        Crea un programa que imprima los números del 1 al 10 cada uno en una nueva línea.
//            for (int i = 1; i <= 10; i++) {
//                System.out.println(i);
//             }
////        Crea un programa que tome una String y te devuelva el número de vocales que tiene la palabra (A, E, I, O, U).
//            Scanner scanner = new Scanner(System.in);
//            System.out.print("Ingrese una palabra: ");
//            String palabra = scanner.nextLine();
//
//            int contador = 0;
//
//            for (int i = 0; i < palabra.length(); i++) {
//                char letra = palabra.charAt(i);
//                if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
//                    contador++;
//                }
//
//            }
//            System.out.println("La palabra " + palabra + " tiene " + contador + " vocales.");
//
////        Crea un programa que tome una String y te devuelva la cantidad de palabras en la String.
//            Scanner scanner2 = new Scanner(System.in);
//            System.out.print("Ingrese una frase: ");
//            String frase = scanner2.nextLine();
//
//            int contador2 = 1;
//
//            for (int i = 0; i < frase.length(); i++) {
//                char letra = frase.charAt(i);
//                if (letra == ' ') {
//                    contador2++;
//                }
//
//            }
//            System.out.println("La frase '" + frase + "' tiene " + contador2 + " palabras.");
//
////        Crea un programa que tome una String y te devuelva la misma frase pero sin espacios.
//
//            Scanner scanner3 = new Scanner(System.in);
//            System.out.print("Ingrese una frase: ");
//            String frase2 = scanner3.nextLine();
//
//            String fraseSinEspacios = "";
//
//            for (int i = 0; i < frase2.length(); i++) {
//                char letra = frase2.charAt(i);
//                if (letra != ' ') {
//                    fraseSinEspacios += letra;
//                }
//
//            }
//            System.out.println("La frase '" + frase2 + "' sin espacios es: " + fraseSinEspacios);
//
//
////      Crea un programa que tome una String y te devuelva la cantidad de letras que hay en la frase o palabra.
//
//        Scanner scanner4 = new Scanner(System.in);
//        System.out.print("Ingrese una frase: ");
//        String frase3 = scanner4.nextLine();
//
//        //usando while
//        int contador3 = 0;
//        while (contador3 < frase3.length()) {
//            contador3++;
//        }
//
//
//        System.out.println("La frase '" + frase3 + "' tiene " + contador3 + " letras.");
//
////      Crea un programa que tome una String llamada contraseña, y que le pida al usuario por esa contraseña. Si el usuario no escribe la contraseña correcta, el programa va a seguir siendo ejecutado hasta que el usuario ponga la contraseña correcta.
//
//        Scanner scanner5 = new Scanner(System.in);
//
//        String contraseñaCorrecta = "contraseña123";
//        System.out.print("Ingrese la contraseña: ");
//        String contraseñaIngresada = scanner5.nextLine();
//
//        while (!contraseñaIngresada.equals(contraseñaCorrecta)) {
//            System.out.println("Contraseña incorrecta, intente nuevamente: ");
//            contraseñaIngresada = scanner5.nextLine();
//        }
//        System.out.println("Contraseña correcta, bienvenido.");
//
//
//
//
////      Crea un programa que tome una String y te dé los caracteres de esa String en reversa (ejemplo: si pones "Nico", el programa te devolvería "o c i N" en la consola)
//
//        Scanner scanner6 = new Scanner(System.in);
//        System.out.print("Ingrese una palabra: ");
//        String palabra2 = scanner6.nextLine();
//
//        String palabraInvertida = "";
//
//        for (int i = palabra2.length() - 1; i >= 0; i--) {
//            palabraInvertida += palabra2.charAt(i);
//        }
//        System.out.println("La palabra '" + palabra2 + "' invertida es: " + palabraInvertida);
//
//        scanner.close();
}
