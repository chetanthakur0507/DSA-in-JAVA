
// Abstract class
abstract class Animal {
    // Abstract method (no body)
    abstract void sound();

    // Normal method (with body)
    void sleep() {
        System.out.println("Animal is sleeping...");
    }
}

// Child class 1
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

// Child class 2
class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}

// Main class
public class abstraction {
    public static void main(String[] args) {
        Animal a;

        a = new Dog();
        a.sound();   // Dog barks
        a.sleep();   // From abstract class

        a = new Cat();
        a.sound();   // Cat meows
    }
}
