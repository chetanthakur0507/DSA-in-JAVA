//polymorphism means hota hai bahut saari form
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}

public class polymorphism {
    public static void main(String[] args) {
        Animal a;  // parent class reference

        a = new Dog();  // object of Dog
        a.sound();      // Output: Dog barks

        a = new Cat();  // object of Cat
        a.sound();      // Output: Cat meows
    }
}
