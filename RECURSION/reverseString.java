public class reverseString {
    public static void reverse(String str,int ind){
        if(ind==0){
            System.out.println(str.charAt(ind));
            return;
        }
        System.out.println(str.charAt(ind));
        reverse(str, ind-1);
    }
    public static void main(String[] args){
        String str="abcsd";
        int ind=str.length()-1;
        reverse(str, ind);
    }
}
