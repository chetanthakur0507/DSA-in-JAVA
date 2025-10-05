public class subarray {
    public static void sub(int arr[]){
        //starting point
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            
            int start=i;
            int sum=0;
            //ending index
            for(int j=i;j<arr.length;j++){
                int end=j;
                
                for(int k=start;k<=end;k++){
                    System.out.print(arr[k]+",");
                }
                sum+=arr[j];
                System.out.print("sum is"+sum);
                if(sum>maxsum){
                    maxsum=sum;
                }
                System.out.println();
                
            }
            
            System.out.println();
            
        }
        System.out.println("maximum sum is"+maxsum);
        
    }
    public static void main(String[] args){
        int arr[]={1,2,3,4,5};
        sub(arr);

    }
}
