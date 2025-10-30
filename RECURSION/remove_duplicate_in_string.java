public class remove_duplicate_in_string {

    public static void removeduplicates(String str,int idx,String newString){
       if(idx==str.length()){
          System.out.println(newString);
          return;
       }
        char currchar=str.charAt(idx);

        if(newString.indexOf(currchar)==-1){
            newString+=currchar;     
        }
        removeduplicates(str, idx+1, newString);

    }
    public static void main(String[] args){
        String s = "aaabccddeff";
        removeduplicates(s, 0, "");
    }
}
