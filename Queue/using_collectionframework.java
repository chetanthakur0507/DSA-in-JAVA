import java.util.ArrayDeque;
import java.util.Queue;

public class using_collectionframework {
    public static void main(String[] args){

        Queue<Integer> q=new ArrayDeque(); 
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(6);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }  
    }
}
