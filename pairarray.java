// public class pairarray {
//     public static void pair(int num[]){
//           for(int i=0;i<num.length;i++){
//                 for(int j=0;j<num.length;j++){
//                     System.out.print("("+ num[i] + "," +num[j]+ ")");
//                 }
//                 System.out.println();
//           }
//     }
//     public static void main(String[] args){
//         int num[]={2,4,6,8,10};
//         pair(num);

//     }
// }




// this is the code of sub array print

public class pairarray{
    public static void subarray(int numbers[]){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<numbers.length;i++){
            int start=i;
            int p=0;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                
                for(int k=start;k<=end;k++){
                    System.out.print(numbers[k]+" ,");
                    
                     
                }
                p=p+numbers[j];
                if(p>max){
                    max=p;   
                }
                if(p<min){
                    min=p;
                }
                
                System.out.println("sum is: "+p);  
            } 
            System.out.println();
            System.out.println();   
        }
        System.out.println("max. value is: "+max);
        System.out.println("min. value is:" + min);
    }
    public static void main(String[] array){

     int numbers[]={2,4,6,8,10};
     subarray(numbers);
     
    }
}