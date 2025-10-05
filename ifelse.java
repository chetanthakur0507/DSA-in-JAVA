import java.util.Scanner;

public class ifelse {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the no.");

        int num= sc.nextInt();
        if(num>18 && num<20){
            System.out.println("you are teenager");

        }
        else if(num>=21 && num<=100){
            System.out.println("you are  adult");
        }
        else if(num<18){
            System.out.println("you are child");
        }
        else{
            System.out.println("you are old");
        }
    }
}
