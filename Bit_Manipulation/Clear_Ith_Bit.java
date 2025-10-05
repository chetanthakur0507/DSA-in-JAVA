public class Clear_Ith_Bit {
    public static int Clear(int n,int i){
        int bitmask=~(1<<i);
        return n & bitmask;

    }
    public static void main(String[] args){
        System.out.println(Clear(15, 1));
    }
}
