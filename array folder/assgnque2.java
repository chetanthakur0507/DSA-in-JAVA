public class assgnque2 {
    public static int check(int nums[],int target){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }

        }
        return -1;
    }
    public static void main(String[] args){
        int nums[]={4};
        int target=3;
        System.out.println(check(nums,target));
    }
    
}
