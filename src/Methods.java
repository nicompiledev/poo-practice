public class Methods {
    public static void main(String[] args) {

        // Llamada al método sayHello() sin argumentos
        sayHello();

        // Llamada al método sayHello() con un argumento o parametro
        sayHello("Juan");
    }


    // Método sayHello() que recibe un parámetro de tipo String
    public static void sayHello(String name) {
        System.out.println("¡Hola, " + name + "! ¡Bienvenido!");

    }

    // Método sayHello() que no recibe parámetros
    public static void sayHello() {
        System.out.println("¡Hola! ¡Bienvenido!");
    }
}
