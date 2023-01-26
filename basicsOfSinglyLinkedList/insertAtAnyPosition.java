package basicsOfSinglyLinkedList;

import javax.print.attribute.standard.Media;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
    Node insertAtFirstPostion(Node head , int data){
        Node firstPosition = new Node(data);
        
        firstPosition.next=head;
        head = firstPosition;
        return firstPosition;
    }
    Node insertAtLastPosition(Node head, int data){
        Node lastPosition = new Node(data);
        Node cur  = head;
        while(cur.next!=null){
        cur  =  cur.next;
        }
       // thatslastPosition.next=null;
        cur.next= lastPosition;
        return head;
    }
    Node insertAtAnyPosition(int data, Node head , int pos){
        Node temp = new Node(data);
        if(pos==0){
          temp.next = head;
          head.next = temp;
        }
        Node cur = head;
        for(int i=0;i<pos-2 && cur!=null; i++){
            cur=cur.next;
        }
        if(cur==null) return head;
        else 
        temp.next = cur.next;
        cur.next= temp;

        return head;




    }
}
public class insertAtAnyPosition {

    
}
