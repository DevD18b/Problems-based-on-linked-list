package basicsOfSinglyLinkedList;
public class middleOfLL {

    public static void main(String [] args){

        
    }
    

}
class Node{
    Node next;
    int data;
    Node(int data){
        this.data = data;
        this.next = null;
    }
    public static Node middle(Node head){

        Node slow = head;
        Node fast  = head;
        while(fast!=null &&fast.next!=null){
            slow = slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}
