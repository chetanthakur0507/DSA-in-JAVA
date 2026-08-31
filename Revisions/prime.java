import java.util.Scanner;

public class prime{
    public static void main(String args[]){
       
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        int arr[]=new int[size];

        for(int i=0;i<arr.length;i++){
            System.out.println("enter the "+ i + " element");
            arr[i]=sc.nextInt();
            if(arr[i] % 2 ==0){
               System.out.println(arr[i] + " is even");
            }
            else{
                System.out.println(arr[i] + " is odd");
            }
        }
        
        
    }
}
