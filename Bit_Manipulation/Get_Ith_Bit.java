public class Get_Ith_Bit {
    public static int getbit(int n,int i){
       int bitmask=1<<i;
       if((n & bitmask)==0){
        return 0;
       }
       else{
        return 1;
       }
        }
    public static void main(String[] args){
        int n=10;
        int i=2;
        System.out.println(getbit(n, i));

    }
}
