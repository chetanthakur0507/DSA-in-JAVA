public class binarysearch {

    public static int check(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        
        while(start<=end){
            int mid=(start+end)/2;

            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
        

    } 
    
    
    public static void main(String[] args){
      int arr[]={2,4,6,8,10,12,14};
      int target=12;

      
      int result=check(arr,target);
      System.out.println("largest no.  is" + " " +result);
    }
    
}
