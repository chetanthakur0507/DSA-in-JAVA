public class sum_naturalno {
    public static void SumofNatular(int i,int n,int sum){
       if(i==n){
        sum+=i;
        System.out.println("sum is "+sum);
        return; 
       }
        sum+=i;
        SumofNatular(i+1, n, sum);


    }
    public static void main(String[] args){
      SumofNatular(1, 5, 0);
    }
    

    

}
