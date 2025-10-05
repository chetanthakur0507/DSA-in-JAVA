import java.util.Scanner;
public class palindrome {
    
//     public static boolean isPalindrome(int x){
//         if(x<0){
//             return false;
//         }
//        int rev=0;
//        while(x>0){
//         int rem=x%10;
//         rev=rev*10+rem;
//         x=x/10;

//        }
//        return rev == x;
       
// }
public static boolean isPalindrome(int x) {
    if (x < 0) {
        return false; // Negative numbers are not palindromes
    }
    
    int orignal=x;
    int reversed = 0;
    
    while (x > 0) {
        int digit = x % 10; 
        reversed = reversed * 10 + digit; 
        x /= 10;
    }
    
    return orignal== reversed; 
}
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no.");
        int num=sc.nextInt();
        boolean ans=isPalindrome(num);
        System.out.println(ans);



    }
}





