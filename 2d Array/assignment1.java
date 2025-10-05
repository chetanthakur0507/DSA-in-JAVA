//print are the no. of 7's in 2d array

import java.util.Scanner;

public class assignment1 {
    // public static int count(int arr[][]){
    //     int sum=0;
    //     for(int i=0;i<arr.length;i++){
    //         for(int j=0;j<arr[0].length;j++){
    //             if(arr[i][j]==7){
    //                 sum++;
    //             }
    //         }
    //     }
    //     return sum;
    // }
    // public static void main(String[] args){
    //     int arr[][]={{4,7,8},{8,7,7}};
    //     System.out.println(count(arr));
    // }


    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the row");
        int row=sc.nextInt();
        System.out.println("enter the size of the column");
        int column=sc.nextInt();
        int matrix[][]=new int[row][column];

        //initialize the value
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.println("enter the element of array at index"+i+","+j);
                matrix[i][j]=sc.nextInt();
            }
        }

        //print the element
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                
                System.out.print(matrix[i][j]);
            }
            System.out.println();
            
        }

    }
}

