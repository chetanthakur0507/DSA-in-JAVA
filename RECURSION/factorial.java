// public class factorial {
//     public static int factorialnum(int n){
//         if(n==0){
//             return 1;
//         }
//         int fac=n*factorialnum(n-1);
//         return fac;
             
//     }
//     public static void main(String[] args){
//         int n=5;
//         System.out.println(factorialnum(n));
        
//     }
// }



public class factorial{
    public static int factnum(int num){
        if(num==0){
            return 1;
        }
        int fact = num * factnum(num-1);
        return fact;
    }
    public static void main(String[] args){
      int num=5;
      System.out.println(factnum(num));
    }
}