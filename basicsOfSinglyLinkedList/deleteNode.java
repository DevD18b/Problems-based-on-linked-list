package basicsOfSinglyLinkedList;

class Node{
    Node next;
    int data;
    Node(int data){
        this.data=data;     
    }
     void iterate(Node head){
        while(head!=null){           System.out.print(head.data+" ");
            head = head.next;
        }
    }
    Node deleteFirstNodeInsideTheLinkedList(Node head){
        if(head == null) return null;
        else
        head = head.next;
        return head;
    }
    Node deleteLastNode(Node head){
        Node cur = head;
        while(cur.next.next!=null){
            cur = cur.next;
        }
        cur = cur.next.next;

        return cur;

    }
    public void deleteNodeAtAnyPosition(Node head , int pos){
        if(pos==0){
            head = head.next;
            return;
        }
        Node cur = head;
        for(int i =0; i<pos-1; i++){
            cur = cur.next;
        }
        cur  =  cur.next.next;
    }
}
public class deleteNode {
// we will see bascically three types of deletion inside the linked list.
// 1 delete first node.
// 2 delete last node.
// delete anyNode.
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next=  new Node(3);
    
    }
}
