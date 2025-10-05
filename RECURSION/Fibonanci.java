public class Fibonanci {
    public static int fibonancino(int n){
        if( n==0 || n==1 ){
            return n ;
        }
        int fn=fibonancino(n-1)+fibonancino(n-2);
        return fn;
        
    }
    public static void main(String[] args){
        int n=6;
        System.out.println(fibonancino(n));    
    }


}
