

public class onedArray {

    public static int linearSearch(String numbers[], String key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
            
        }
        return -1;
    }
    public static void main(String[] args){
        String inputstring[]={"apple","banana","mango","orange"};
        String key ="orange";
        int index=linearSearch(inputstring, key);
        if(index== -1){
             System.out.println("not found");
        }
        else{
            System.out.println("key is at index  :" + index);
        }
        
       
    }
}







// Create the array and find the largest no.

    

// import java.util.Scanner;

// public class onedArray{
//     public static int getlargest(int num[],int largest){
//            for(int i=0;i<num.length;i++){
//                 if(num[i]>largest){
//                     largest = num[i];
//                 }
//            }
//            return largest;
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the size of array");
//         int p=sc.nextInt();
//          int num[]=new int[p];
//          for(int i=0;i<num.length;i++){
//             System.out.println("enter the array element");
//             num[i]=sc.nextInt();
//          }

//          int largest=Integer.MIN_VALUE;
//          System.out.println("largest value is "+ getlargest(num, largest));
        
//     }
// }

        
        
    