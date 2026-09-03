public class printdiagonal{

    public static void main(String[] args){
        
        int arr[][]={{1,2,3},{3,4,5},{6,7,8}};
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }

        }
        //reverse

        for(int i=0;i<arr.length;i++){
            int left=0;
            int right=arr.length-1;

            while(left<right){
                int temp=arr[i][right];
                arr[i][right]=arr[i][left];
                arr[i][left]=temp;

                left++;
                right--;
            }
        }

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}