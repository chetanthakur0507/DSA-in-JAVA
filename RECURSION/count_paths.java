public class count_paths {

    public static int countpaths(int m,int n,int i , int j){
        if(i==m || j==n){
            return 0;
        }
        if(i==m-1 || j==n-1){
            return 1;
        }
       
        int downpath=countpaths(m, n, i+1, j);

        int rightpath=countpaths(m, n, i, j+1);

        return downpath+rightpath;
    }
    public static void main(String[] args){
        int totalPaths=countpaths(3, 3, 0, 0);
        System.out.println(totalPaths);

    }
}
