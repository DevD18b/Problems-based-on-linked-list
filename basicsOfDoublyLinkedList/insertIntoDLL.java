package basicsOfDoublyLinkedList;
class Node{
    Node next;
    Node prev;
    int data;
    Node(int data){
       this.data=data;
    }
   void  insertBegin(Node head , int data ){
    Node newHead = new Node(data);
    newHead.next =  head;
    if(head!=null)
    head.prev=newHead;
   }
   Node insertAtTheEnd(Node head , int data){
    Node newNode = new Node(data);
    
    if(head==null) return newNode;
   
    Node cur = head;
    while(cur.next!=null){
        cur=cur.next;
    }
    cur.next=newNode;
    newNode.prev=cur;
    return head;
   }
}

public class insertIntoDLL {

    
}
