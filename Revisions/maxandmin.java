
    public class maxandmin {
        public int[] getMinMax(int[] arr) {
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
    
            for (int num : arr) { // Using enhanced for loop
                if (num > max) {
                    max = num;
                }
                if (num < min) {
                    min = num;
                }
            }
    
            return new int[]{min, max}; // Return both values as an array
        }
    
        public static void main(String[] args) {
            int arr[] = {3, 2, 1, 56, 1000, 167};
    
            maxandmin obj = new maxandmin(); // Create an instance
            int[] result = obj.getMinMax(arr);
            
            System.out.println("Minimum: " + result[0]);
            System.out.println("Maximum: " + result[1]);
        }
    }
    

