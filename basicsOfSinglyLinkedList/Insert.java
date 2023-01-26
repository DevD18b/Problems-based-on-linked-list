package basicsOfSinglyLinkedList;
class Node{
    Node next;
    int data;
    Node(int data){
        this.data = data;
    }
     public void iterate(Node head){
        while(head!=null){
            System.out.print(head.data+" ");
            head = head.next;
        }
    }
}
public class Insert{
public static void main(String[] args) {
    Node head = new Node(15);
    head.next= new Node(16);
    head.next.next= new Node(17);
    head.next.next.next= new Node(18);

      head.iterate(head);

}
}
