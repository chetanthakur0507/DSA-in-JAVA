public class decreasing {
//5,4,3,2,1
    public static void decreasingnum(int n){
      if(n==1){
        System.out.println(n);
        return;
      }
      System.out.println(n);
      decreasingnum(n-1);
    }
    public static void main(String[] args){
      int n=10;
      decreasingnum(n);
    }
}
