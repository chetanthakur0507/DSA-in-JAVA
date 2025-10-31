public class place_tiles {
    public static int placetiles(int m,int n){

        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }
        int vertplacements=placetiles(m, n-m);

        int horplacements=placetiles(m, n-1);

        return vertplacements+horplacements;
    }
    public static void main(String[] args){
     System.out.println(placetiles(2, 4));
    }
}
