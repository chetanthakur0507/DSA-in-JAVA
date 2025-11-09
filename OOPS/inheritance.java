
// Parent class (Base class)
class Animal {
    String name;

    // Constructor
    public Animal(String name) {
        this.name = name;
    }

    // Parent method
    public void eat() {
        System.out.println(name + " is eating...");
    }

    public void sleep() {
        System.out.println(name + " is sleeping...");
    }
}

// Child class (Derived class) inherits from Animal
class Dog extends Animal {

    // Child class constructor
    public Dog(String name) {
        // call parent class constructor
        super(name);
    }

    // New method in child class
    public void bark() {
        System.out.println(name + " is barking...");
    }

    // Overriding parent method
    @Override
    public void eat() {
        System.out.println(name + " is eating bones...");
    }
}

// Main class
public class inheritance {
    public static void main(String[] args) {
        // Create object of child class
        Dog dog = new Dog("Bruno");

        // Calling parent class methods
        dog.sleep();     // Inherited from Animal

        // Calling overridden method
        dog.eat();       // From Dog class

        // Calling child class method
        dog.bark();      // Specific to Dog
    }
}


