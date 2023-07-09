// Base class or superclass
class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }

    public void showInformation() {
        System.out.println("Animal's name: " + name);
    }
}