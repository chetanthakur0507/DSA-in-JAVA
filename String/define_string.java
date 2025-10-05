import java.util.Scanner;

public class define_string {
    public static void main(String[] args){

       //declaration of string

       String name="chetan thakur";
       System.out.println(name);

       //string taking from user

       Scanner sc=new Scanner(System.in);
       System.out.println("enter your father name");
       
       String father_name=sc.nextLine();
       System.out.println("your father name is "+father_name);

       String ho=" ";
       System.out.println(ho);

       String[] strArray = new String[5];
        System.out.println(strArray[0]);

        //concatination

        String firstname="chetan";
        String lastname="thakur";
        System.out.println(firstname+lastname);


        // String firstname="chetan";
        // String lastname="thakur";
        // String name=new String("thakur");
        // System.out.println(firstname.compareTo(lastname));
        



        // System.out.println(firstname.length());
        // for(int i=0;i<firstname.length();i++){
        //     System.out.println(firstname.charAt(i));
        // int s=firstname.compareTo(lastname);
        // if(s==1){
        //     System.out.println("string is not equal");
        // }
        // else if(s==0){
        //     System.out.println("String are equal");
        // }
            
        // }

    }
    }

