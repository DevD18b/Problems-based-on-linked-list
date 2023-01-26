package basicsOfDoublyLinkedList;

public class RemoveDuplcatesFromDLL {
    
}
class Node{
    int data;
    Node next;
    Node prev;
    Node(int data){
        this.data=data;
        this.prev=this.next = null;
    }
    public static Node remove(Node head){
        if(head==null || head.next==null) return null;
      Node cur = head;
      while(cur.next.next!=null){
        if(cur.data==cur.next.data){
            cur.next = cur.next.next;
            cur.prev.next=cur;
        }
        else{
            cur=cur.next;
        }
      }
      if(cur.data==cur.next.data){
        cur.next = null;
      }
      return head;
    }
}
