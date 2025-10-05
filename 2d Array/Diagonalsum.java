// timecomplexity is more of this code


// public class Diagonalsum {
//     public static int diagonal(int matrix[][]){
//         int sum=0;
//         for(int i=0;i<matrix.length;i++){
//             for(int j=0;j<matrix[0].length;j++){
//                 if(i==j){
//                     sum+=matrix[i][j];
//                 }
//                 else if(i+j==matrix.length-1){
//                     sum+=matrix[i][j];
//                 }
//             }
            
//         }
//         return sum;

//     }
//     public static void main(String[] args){
//         int matrix[][]={{1,2,3,4},
//                         {5,6,7,8},
//                         {9,10,11,12},
//                          {13,14,15,16}};
//          System.out.println(diagonal(matrix));                
//     }
// }





// this is the good code




public class Diagonalsum {
    public static int diagonal(int matrix[][]){
        int sum=0;

        //primary diagonal
        
        for(int i=0;i<matrix.length;i++){
            sum+=matrix[i][i];

            // second diagonal
            //if condition is taken because matrix is not (m*m)
            

            if(i!=matrix.length-i-1){
            sum+=matrix[i][matrix.length-i-1];
            }
            
        }
        return sum;

    }
    public static void main(String[] args){
        int matrix[][]={
                        {5,6,7},
                        {9,10,11},
                         {13,14,15}};
         System.out.println(diagonal(matrix));                
    }
}
