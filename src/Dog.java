// Derived class or subclass
class Dog extends Animal {
    private String breed;

    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    public void makeSound() {
        System.out.println("The dog barks.");
    }

    public void showInformation() {
        super.showInformation();
        System.out.println("Dog's breed: " + breed);
    }
}