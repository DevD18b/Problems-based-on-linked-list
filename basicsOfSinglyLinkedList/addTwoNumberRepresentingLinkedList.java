package basicsOfSinglyLinkedList;


public class addTwoNumberRepresentingLinkedList {

}
class Node{
    Node next;
    int data;
    Node(int data){
        this.data=data;
        this.next = null;
    }
    Node(Node a , Node b){
        
        Node dummy = new Node(0);
        Node temp= dummy;
        int carry = 1;
        while(a!=null || b!=null || carry==1){
            int sum =0;
            if(a!=null){
                sum+=a.data;
                a=a.next;
            }
            if(b!=null){
            sum+=b.data;
            b=b.next;
            }
            sum+=carry;
           carry=sum/10;
           Node node 
           = new Node(sum%10);
           temp.next=node;
           temp = temp.next;
        }
    }
}
