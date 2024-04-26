package Opps;

public class SubclassConstructorExample {
    public static void main(String[] args) {
        // Creating an object of the subclass (Dog)
        Dog myDog = new Dog("Canine", "Golden Retriever");

        // Accessing fields of the superclass and subclass
        System.out.println("Species: " + myDog.species);
        System.out.println("Breed: " + myDog.breed);

        // Calling a method from the abstract class
        myDog.makeSound();
    }
}

abstract class Animal {
    String species;

    // Constructor of the abstract class
    public Animal(String species) {
        System.out.println("Abstract class constructor");
        this.species = species;
    }

    // Abstract method
    abstract void makeSound();
}

// Make sure the Dog class is declared as public
class Dog extends Animal {
    String breed;

    // Constructor of the subclass
    public Dog(String species, String breed) {
        // Call the constructor of the abstract class using 'super'
        super(species);
        System.out.println("Subclass constructor");
        this.breed = breed;
    }

    // Implementation of the abstract method
    void makeSound() {
        System.out.println("Dog barks");
    }
}
