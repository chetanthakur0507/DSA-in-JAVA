class Student{
    String name;
    int marks;
    int age;


    public void print(){
        System.out.println(this.name);

    }

    // default no-arg constructor
    Student() {
    }


    // using the other objects value constructor value
    Student(Student s2){
        this.name = s2.name;
        this.age = s2.age;
        this.marks = s2.marks;
    }


    //constructor
    
    // Student(String name,int age){
    //     this.name=name;
    //     this.age=age;
    // } 

    

}


public class constructor {
    public static void main(String[] args){
        
        Student s1=new Student();
        s1.name="chetan thakur";
        s1.age=24 ;
        s1.marks=47;
       
        Student s2=new Student(s1);
        s2.print();
            
    }
}
