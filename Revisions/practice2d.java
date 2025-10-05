import java.util.Scanner;

public class practice2d {
    public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the value of row");
     int row=sc.nextInt();
     System.out.println("enter the value of col");
     int col=sc.nextInt();

     int array[][]=new int[row][col];
     for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            System.out.println("enter the value of index"+i+","+j);
            array[i][j]=sc.nextInt();
         
        }
    }


     //print the 2d array
     for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            System.out.print(array[i][j]);
            
        }
        System.out.println();
     }

     //search number
     System.out.println("enter the search no.");
     int search=sc.nextInt();

     for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            if(array[i][j]==search){
                System.out.println("i="+i+"j="+j);
            }
            
        }
        System.out.println();
     }


    }
}
