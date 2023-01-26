package basicsOfSinglyLinkedList;
import java.util.*;
public class IntersectionInYShapedLinkedList {

    
}
class Node{
    Node next;
    int data;
    Node(int data){
        this.data=data;
    }
     Node intersection(Node head1 , Node head2){
        HashSet<Integer> set = new HashSet<>();
        while(head1!=null){
            set.add(head1.data);
            head1=head1.next;
        }
        Node dummy =  new Node(0);
        Node pre = dummy;
        while(head2!=null){
            if(set.contains(head2.data)){
                pre.next=new Node(head2.data);
                pre=pre.next;
            }
            head2=head2.next;
        }
         pre.next=null;
         return dummy.next;    
     }
}
