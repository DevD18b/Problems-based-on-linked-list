package basicsOfSinglyLinkedList;

public class cycleDetection {
    
}
class Node{
    Node next;
    int data;
    Node(int data){
        this.data = data;
    }
    public static Node detect(Node head , int pos){
        // its kind of medium lc problme not that standard rabit hare lc problem
        Node slow = head;
        Node fast = head;
        // pos is used to define that our tail.next is pointing to node at position this.

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast==slow){
               Node slow2 = slow;
                while(slow2!=slow){
                    slow2 =slow2.next;
                    slow=slow.next;
                }
                return slow;
            }
        }
        return null;



    }
}
