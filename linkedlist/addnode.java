import java.util.Collections;

class addnode {
    Node head;
    private int size;

    addnode(){
        this.size=0;
    }

    class Node{
        String data;
        Node next;

        Node(String  data){
            this.data=data;
            this.next=null;
            size++;
        }
    }


    //add - in the first , and in the last
    public void addFirst(String data){
        Node newNode=new Node(data);

        if(head==null){
            head=newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
     }

    
     //add the element in the last of linkedlist
     public void addlast(String data){
        Node newNode=new Node(data);
        if(head==null){
        head=newNode;
        return;
        }

        Node currNode=head;
         while(currNode.next!=null){
            currNode=currNode.next;
         }  
         currNode.next=newNode;
     }


      //delete - first,last

   //delete from the first
   public void deletefirst(){
    if(head==null){
        System.out.println("the list is empty");
       return;
    }
    size--;
     head=head.next;
   }

 
   //delete from the last
   public void deletelast(){
    if(head==null){
        System.out.println("the list is empty");
        return;
    }
    size--;
    if(head.next==null){
        head=null;
        return;
    }
    Node secondLast=head;
    Node lastNode=head.next;
    while(lastNode.next !=null){
        lastNode=lastNode.next;
        secondLast=secondLast.next;
    }
    secondLast.next=null;

   }


     //Print the list
     public void printlist(){

        if(head==null){
            System.out.println("list is empty");
        }
        Node currNode=head;
        while(currNode != null){
            System.out.print(currNode.data+"->");
            currNode=currNode.next;
        }
        System.out.println("NULL");      
     }

     public int getsize(){
        return size;
     }
  
    public static void main(String[] args){
       addnode list=new addnode();
       list.addFirst("a");
       list.addFirst("is");
       list.printlist();
       list.addlast("list");
       list.addFirst("this");
       list.printlist();
       list.deletefirst();
       list.printlist();
       list.deletelast();
       list.printlist();
       System.out.println(list.getsize());
     

    }
}
