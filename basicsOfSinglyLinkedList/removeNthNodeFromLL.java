package basicsOfSinglyLinkedList;

public class removeNthNodeFromLL {
    
}

class Node{
    Node next;
    int data;
    Node(int data){
        this.data = data;
    }
    Node(){

    }
    public static Node delete(Node head , int pos){
        Node start = new Node();
        Node fast = start;
        Node slow = fast;
        // move fast nth pos away from slow.
        for(int i =1; i<=pos; i++){
            fast=fast.next;
        }
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return
    start;
    }
}
