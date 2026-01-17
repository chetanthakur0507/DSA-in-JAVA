import java.util.*;

public class collection_framework {
    public static void main(String[] args){
        LinkedList<String> list=new LinkedList<>();
        
 
        //add the element in the starting of the list
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("this");
        System.out.println(list);

        //add the element in the last of the list
        list.addLast("list");
        System.out.println(list);

        //print the size of the list
        System.out.println(list.size());

        //print the element of the list using loop
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+"->");
        }
        System.out.println("null");

        //delete the element from the starting
        list.removeFirst();
        System.out.println(list);

        

        //delete the element from the last
        list.removeLast();
        System.out.println(list);

        //delete the element using index
        list.remove(1);
        
        Collections.sort(list);
        System.out.println(list);
    }
    
}
