public class substring {
    public static String substrings(String b,int si,int ei){
        String sb="";
     for(int i=si;i<ei;i++){
      sb+=b.charAt(i);
     }
        return sb;
    }
    public static void main(String[] args){
        String b="helloworld";
        System.out.println(substrings (b,0, 5));
    }
}
