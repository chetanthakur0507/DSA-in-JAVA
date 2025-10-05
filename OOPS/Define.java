public class Define {
   public static void main(String[] args){
    Pen p1=new Pen();
    p1.setcolor("blue");
    System.out.println(p1.color);
    p1.setTip(5);
    System.out.println(p1.tip);
    p1.color="black";
    System.out.println(p1.color);


    Student p2= new Student();
    p2.name="chetan";
    System.out.println(p2.name);
    p2.age=34;
    System.out.println(p2.age);
    p2.calcpercentage(3, 34, 23);
    System.out.println(p2.percentage);
   }

}
class Pen{
    String color;
    int tip;
    void setcolor(String newColor){
        color=newColor;
    }
    void setTip(int newTip){
        tip=newTip;
    }
  
}
class Student{
    String name;
    int age;
    float percentage;
    void calcpercentage(int math,int physics,int chemistry){
        percentage=(math+physics+chemistry)/3;
    }
    
}