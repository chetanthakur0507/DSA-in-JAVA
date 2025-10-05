
public class solution {
    public static int searchInsert(int nums[], int target) {
      int left=0;
      int right=nums.length;
      for(int i=0;i<nums.length;i++){
       int mid=left+(left-right)/2;
       if(nums[mid]==target){
        return mid;
       }
       else if(nums[mid]<target){
          left=mid+1;
       }
       else{
          right=mid-1;
       }
        
       
        
      }
      return left;

        
    }
    public static void main(String[] args){
        int nums[]={1,3,5,6,8,9,10,11};
        int target=8;
        int output=searchInsert(nums,target);
        System.out.println(output);
    }
}