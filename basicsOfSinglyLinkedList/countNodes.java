package basicsOfSinglyLinkedList;

public class countNodes {

    public static int countNodesInAnyLL(Node head){

        int count  =0;
        Node cur  = head;
        while(cur.next!=null){
            cur=cur.next;
            count++;
        }
        return count;
    }
    
    
}
