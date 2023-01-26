package basicsOfSinglyLinkedList;



class Node{
    Node next;
    int data;
    Node(int data){
        this.data = data;
    }

    public int search(Node head , int data){
        int pos = 1;
        if(head.data == data) return pos;

        Node cur =head;
        while(cur!=null){
            
            if(cur.data==data){
                return pos;
            }
            pos++;
            cur = cur.next;

        }
        return -1;

    }
}


public class searchingInLinkedList {
    public static void main(String[] args) {
        
    }
    
}
