


    import java.util.Arrays;

    public class subset {
        public static boolean isSubset(int[] A, int[] B) {
            for (int i = 0; i < A.length; i++) {
                boolean found = false;
                for (int j = 0; j < B.length; j++) {
                    if (A[i] == B[j]) {
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    return false;
                }
            }
            return true;
        }
        
        public static void main(String[] args) {
            int[] A = {1, 3, 9};
            int[] B = {1, 2, 3, 4, 5, 6};
            
            if (isSubset(A, B)) {
                System.out.println("A is a subset of B");
            } else {
                System.out.println("A is not a subset of B");
            }
        }
    }
    

    

