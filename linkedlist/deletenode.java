 class deletenode{
    Node head;

   class Node{
    String data;
    Node next;

    Node(String data){
        this.data=data;
        this.next=null;
    }
   }
   //delete - first,last

   //delete from the first
   public void deletefirst(){
    if(head==null){
        System.out.println("the list is empty");
       return;
    }
     head=head.next;
   }

 
   //delete from the last
   public void deletelast(){
    if(head==null){
        System.out.println("the list is empty");
        return;
    }
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
   

   public static void main(String[] args){
    deletenode list=new deletenode();

   }
    
}