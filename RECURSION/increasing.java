public class increasing {
    //1,2,3,4,5
    public static void increaingnum(int n){
        if(n==6){
            
            return;
        }
        System.out.println(n);
        increaingnum(n+1);
        
    }
    public static void main(String[] args){
        int n=1;
        increaingnum(n);
    }

//thsi is the other example

    // public static void increaingnum(int n){
    //     if(n==0){
            
    //         return;
    //     }
        
    //     increaingnum(n-1);
    //     System.out.println(n);
        
    // }
    // public static void main(String[] args){
    //     int n=6;
    //     increaingnum(n);
    // }
}
