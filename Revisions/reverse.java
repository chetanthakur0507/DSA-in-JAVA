public class reverse {

  
    public static void main(String[] args){
        String str="chetan";
        String reversed="";
        for(int i=str.length();i>=0;i++){
            reversed+=str.charAt(i);
        }
    }
}




// public class reverse {
//     public static void reverseStr(String str) {
//         StringBuilder rev = new StringBuilder(str);
//         rev.reverse(); // Efficient way to reverse a string
//         System.out.println(rev);
//     }

//     public static void main(String[] args) {
//         String str = "chetan";
//         reverseStr(str);
//     }
// }
