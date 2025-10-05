public class Update_Ith_bit {
    public static int Clear(int n,int i){
        int bitmask=~(1<<i);
        return n & bitmask;

    }
    public static int setbit(int n,int i){
        int bitmask=1<<i;
        return n|bitmask;
        
         }
    public static int updatebit(int n,int i,int newbit){
       if(newbit==0){
        return Clear(n, i);
       }
       else{
        return setbit(n, i);
       }
    }

    public static void main(String[] args){
       System.out.println( updatebit(10, 2, 0));
    }
}
