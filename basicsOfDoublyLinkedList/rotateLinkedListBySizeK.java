package basicsOfDoublyLinkedList;

public class rotateLinkedListBySizeK {
    
}
class Node{
    int data;
    Node next;
    Node prev;
    Node(int data){
        this.data = data;
        this.prev = this.next = null;
    }
    public static Node rotate(Node head, int k ){
       // Node temp = head;
        for(int  i =0; i<k; i++){
           Node temp = head;
           while(temp.next.next!=null) temp = temp.next;
             Node end = temp.next;
             temp.next=null;
             end.next = head;
              head = end;
        }
        return head;
    }
}
