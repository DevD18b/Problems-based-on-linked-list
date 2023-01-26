package basicsOfSinglyLinkedList;

public class deleteMiddleNode {
    
}
class Node{
    Node next;
    int data;
    Node(int data){
        this.data = data;
        this.next = null;
    }
    public static Node deleteMiddle(Node head){
        Node slow = head;
        Node fast = head;
        Node cur = head;
        while(fast!=null && fast.next!=null){
            cur = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        cur.next = slow.next;
        slow=null;
        return head;
        
    







    }
}
