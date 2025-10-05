import java.util.Scanner;


public class define2D {
    public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the size of the row");
            int row=sc.nextInt();
            System.out.println("enter the size of the column");
            int col=sc.nextInt();
         
            //create array

            int arr[][]=new int[row][col];
           
            // input the array element
            
            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    System.out.println("enter the element of array at index"+i +","+ j);
                    
                    arr[i][j]=sc.nextInt();
                }
            }
            System.out.println("enter the search element");
            // print the array element

            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    System.out.print(arr[i][j]);
                    System.out.print(" ☺️");
                }
                System.out.println();
            }


            // search element
            System.out.println("enter the search element");
            int a=sc.nextInt();
            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    if(a==arr[i][j]){
                        System.out.println("search element is find at index"+ '(' + i+','+j +')');
                    } 
                    else{
                        System.out.println("enter element is not find");
                        break;
                        
                    }
                    
                }
               
            }
                 
    }
}
