package basicsOfDoublyLinkedList;
class Node{
    Node next;
    Node prev;
    int data;
    Node(int data){
       this.data=data;
    }

    Node deletionAtTheBegaining(Node head){

          head =  head.next;
          head.prev=null;

          return head;
    }

    Node deletionAtTheEnding(Node head){
        Node cur = head;
        Node prev = null;
        while(cur.next!=null){
            prev = cur;
            cur = cur.next;
        }
        prev.next=null;
        cur.prev=null;
        return head;
         
        
        



    }


}
public class deletion {
    
}
