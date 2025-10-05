//sum of the second row

// public class assignment2{
//     public static int sumfind(int nums[][]){
//         int sum=0;
//         for(int i=0;i<nums.length;i++){
//             for(int j=0;j<nums[0].length;j++){
//                if(i==1){
//                 sum+=nums[i][j];
//                }
//             }
//         }
//         return sum;
//     }
//     public static void main(String[] args){
//         int nums[][]={{1,4,9},{11,4,3},{2,2,3}};
//         System.out.println(sumfind(nums));

//     }
// }



// this is the second type to solve the question


public class assignment2{
    public static int sumfind(int nums[][]){
        int sum=0;
        int rowindex=1;
        for(int i=0;i<nums[rowindex].length;i++){
              sum+=nums[rowindex][i];
        }
        return sum;
    }
    public static void main(String[] args){
        int nums[][]={{1,4,9},{11,4,3},{2,2,3}};
        
        System.out.println(sumfind(nums));

    }
}