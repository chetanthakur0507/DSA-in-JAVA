// import java.util.Scanner;

// public class assignment3 {
//     public static int profitfind(int price[]){
//         int buyprice=Integer.MAX_VALUE;
//         int maxprofit=0;
//       for(int i=0;i<price.length;i++){
//         if(buyprice<price[i]){
//             int profit=price[i]-buyprice;
//             maxprofit=Math.max(maxprofit, profit);
//         }
//         else{
//             buyprice=price[i];
//         }
        
//       }
//       return maxprofit;
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the size of the array");
//         int p=sc.nextInt();
//         int price[]=new int[p];
//         for(int i=0;i<price.length;i++){
//             System.out.println("enter the element of array at index"+i);
//             price[i]=sc.nextInt();
//         }
//         System.out.println("Maximum profit is"+profitfind(price));
//     }
// }
