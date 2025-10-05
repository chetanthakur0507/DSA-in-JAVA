public class reversearray {
    
    public static int[] reved(int arr[]) {
        int arrs[] = new int[arr.length];  

        for (int i = 0; i < arr.length; i++) {
            arrs[i] = arr[arr.length - i - 1];  
        }

        return arrs;  
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        
        
        int reversedArr[] = reved(arr);  
        System.out.print("Reversed Array: ");
        for (int i=0;i<reversedArr.length;i++) {  
            System.out.print(reversedArr[i]+ " ");
        }
    }
}








