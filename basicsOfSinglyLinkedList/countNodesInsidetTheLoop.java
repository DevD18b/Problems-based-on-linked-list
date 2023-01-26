package basicsOfSinglyLinkedList;

public class countNodesInsidetTheLoop {

   
}
class Node{
    Node next;
    int data;
    Node(int data){
        this.data = data;
    }
    int countNodes(Node head){
        Node slow = head;
        Node fast  = head;
        int count  =0;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow==fast){
                count = count(slow); 
            } 
        }
        return count;
    }
    int count(Node head){
        int count  = 1;
        Node cur = head;
        while(cur!=head){
            count++;
            cur = cur.next;
        }
        return count;
    }

}
