public class Set_Ith_Bit {
    public static int getbit(int n,int i){
        int bitmask=1<<i;
        return n|bitmask;
        
         }
     public static void main(String[] args){
         int n=15;
         int i=2;
         System.out.println(getbit(n, i));
 
     }
}
