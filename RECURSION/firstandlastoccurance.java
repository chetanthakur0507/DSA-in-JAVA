public class firstandlastoccurance {
    public static int first=-1;
    public static int last=-1;
    public static void findoccur(String str,int idx,char element){

        if(idx==str.length()){
            System.out.println(first);
            System.out.println(last);
            
            return;
        }

        char currentelement=str.charAt(idx);
        if(currentelement==element){
            if(first== -1){
                first=idx;
            }
            else{
               last=idx;
            }
        }
        findoccur(str, idx+1, currentelement);

    }
    public static void main(String[] args){
        String str="asnfsjkaadskjaa";
        int idx=0;
        char element='a';
        findoccur(str, idx, element);

    }
}
