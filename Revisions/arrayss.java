
public class arrayss{
  public static int fib(int n){
    if(n==0 || n==1){
      return n;
    }
   
    int fi=fib(n-1)+fib(n-2);
    return fi;

  }
 public static void main(String[] args){
  int n=5;
  System.out.println(fib(n));

 }
}