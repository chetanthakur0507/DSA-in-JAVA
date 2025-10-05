public class Odd_or_Even {
    public static void oddoreven(int n){
        int bitmask=1;
        if((n & bitmask)==0){
            System.out.println("no is even");
        }
        else{
            System.out.println("no. is odd");
        }
    }
    public static void main(String[] args){
        oddoreven(3);

    }
}
