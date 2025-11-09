// Class with encapsulation
class Student {
    // private data members (data hidden from outside)
    private String name;
    private int age;

    // public setter method (to set data)
    public void setName(String name) {
        this.name = name;
    }

    // public getter method (to get data)
    public String getName() {
        return name;
    }

    // public setter method
    public void setAge(int age) {
        if (age > 0) { // simple validation
            this.age = age;
        } else {
            System.out.println("Invalid age!");
        }
    }

    // public getter method
    public int getAge() {
        return age;
    }
}

// Main class
public class encapsulation {
    public static void main(String[] args) {
        Student s = new Student();

        // Setting values using setter methods
        s.setName("Chetan");
        s.setAge(21);

        // Getting values using getter methods
        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());

        // Trying invalid input
        s.setAge(-5);  // Will show validation message
    }
}

