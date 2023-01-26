package basicsOfDoublyLinkedList;

public class deletionOfDoublets {
    
}
class Node{
    Node next;
    Node prev;
    int data;
    Node(int data){
        this.data=data;
        this.prev=null;
    }
    public Node  deletionOfDLL(Node head , int key){
        if(head ==null) return null;
        if(head.data==key) return head.next;
        Node cur = head;
        while(cur!=null){
            if(cur.data == key){
                if(cur.next!=null){
                cur.next.prev = cur.prev;
                }
                if(cur.prev!=null){
                cur.prev.next = cur.next;
            }
        }
        cur = cur.next;

        }
        return head;
    }
   
}
