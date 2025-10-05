import java.util.Scanner;

public class switches {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("choose any given no. 1,2,3");
        int num=sc.nextInt();

        switch (num) {
            case 1:
                System.out.println("today is monday");
                break;
            case 2:
                System.out.println("today is tuesday");
                break;
            case 3:
                System.out.println("today is wednesday");
                break;
            default:
                System.out.println("you are not choose correct no.");
                break;
        }
    }
}
