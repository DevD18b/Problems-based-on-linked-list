package basicsOfSinglyLinkedList;

public class segrigateLinkedList {
    
    
}

class Node{
    Node next;
    int data;
    Node(int data){
        this.data = data;
    }
    
  public static Node appendOddEvenLinkedList(Node head){
    Node oh =  null;
    Node ot =  null;
    Node eh =  null;
    Node et =  null;
 
    int count  = 1;

    while(head!=null){
        if(count%2==0){
            if(eh==null){
             eh = head;//new Node(head.data);
             et = head; //new Node(head.data);
               head=head.next;
            }
        else{
             et.next = head;
             et=et.next;
             head = head.next;
        }
    }
        else{
            if(oh==null){
                oh = head; //new Node(head.data);
                ot =  head;//new Node(head.data);
                head = head.next;
            }
            else{
                ot.next =head;
                ot=ot.next;
                head=head.next;
            }
        }
        count+=1;
    }
    ot.next = eh;
    return oh;


}





}