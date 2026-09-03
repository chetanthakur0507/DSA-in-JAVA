
public class max {
    public static void main(String[] args){
       int max=Integer.MIN_VALUE;
       int secondmax=0;
       int arr[]={1,2,10,12,5};


       for(int i=0;i<arr.length;i++){
         if(arr[i]>max){
            secondmax=max;
            max=arr[i];
         }
       }
       System.out.println(max);
       System.out.println(secondmax);
    
    }
}
