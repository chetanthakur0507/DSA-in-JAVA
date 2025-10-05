public class spiral_matrix {
    public static void spiral(int matrix[][]){
       int startrow=0;
       int startcol=0;
       int endrow=matrix.length-1;
       int endcol=matrix[0].length-1;
      
        while (startrow<=endrow  && startcol<=endcol) {

            //top 
            // row is same and col is different
            for(int j=startcol;j<=endcol;j++){
               System.out.println(matrix[startrow][j]+" ");
            }

            //right
            // col is same and row is different
             for(int i=startrow+1;i<=endrow;i++){
                System.out.println(matrix[i][endcol]+" ");
             }
             //bottom 
             for(int j=endcol-1;j>=startcol;j--){
                System.out.println(matrix[endrow][j]+" ");
             }

             //left
             for(int i=endrow-1;i>=startrow+1;i--){
                System.out.println(matrix[i][startcol]+" ");
             }

             startrow++;
             endcol--;
             endrow--;
             startcol++;
        }

    }
    public static void main(String[] args){
                int matrix[][]={{1,2,3,4},
                                {5,6,7,8},
                                {9,10,11,12},
                                 {13,14,15,16}};
                 spiral(matrix);  
}
}
