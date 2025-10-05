import java.util.Scanner;

public class power {

    public static void average(int x,int n){
        int result=1;
        for(int i=1;i<=n;i++){
            
            result*=x;
            
        }
        System.out.println(result);
    }
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       
       System.out.println("enter the first no.");
       int a=sc.nextInt();
       System.out.println("enter the second no.");
       int b=sc.nextInt();
       average(a, b);
       

    }
}
