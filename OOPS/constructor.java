public class constructor {
    public static void main(String[] args){
        student s1=new student("chetanthakur");
        
        
        System.out.println(s1.name);
        student s2=new student(4);
        System.out.println(s2.marks);
        
        
        
    }
}
class student{
    String name;
    int marks;
    int age;
    student(String name){
        this.name=name;
    }
    student(int marks){
        this.marks=marks;
    }
    
    
}
