import java.util.*;

public class array_list {
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<>();

        //add the element in thwe list
       list.add(0);
       list.add(1);
       list.add(5);
       list.add(2);
       

       System.out.println(list);

       //get the element from the list
       int element=list.get(2);
       System.out.println(element);

       //add the element in between on the given index
           list.add(0,1);
           System.out.println(list);

           // set element kisi ko update karna
           list.set(0,5);
           System.out.println(list);

           //delete the element from the list
           list.remove(0);
           System.out.println(list);

           //this function return the size of the llist
          
           int size=list.size();
           System.out.println(size);


           //print the element of the list using loop
           for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
           }
           System.out.println();


           Collections.sort(list);
           System.out.println(list);
    }

}
