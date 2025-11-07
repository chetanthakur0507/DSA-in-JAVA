class pen{
       
    String color;
    String type;

    public void write(){
        System.out.println("write Something");
    }
    public void color(){
        System.out.println(this.color);
    }

}

class Student{
    String name;
    String room;
    String color;

    public  void color(){
        System.out.println(this.color);
    }
    
}


public class class_and_object {
    public static void main(String[] args){

        pen p1=new pen();
        p1.color="red";
        p1.type="ball";
        p1.write();
        
        pen p2=new pen();
        p2.color="pink";

         p1.color();
         p2.color();

         Student s1=new Student();

         s1.name="chetan";
         s1.color="Black";
         s1.color();
       

    }
}
