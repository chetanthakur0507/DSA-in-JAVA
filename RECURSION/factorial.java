public class factorial {
    public static int factorialnum(int n){
        if(n==0){
            return 1;
        }
        int fac=n*factorialnum(n-1);
        return fac;
        
        
    }
    public static void main(String[] args){
        int n=5;
        System.out.println(factorialnum(n));
        
    }


    
}
