package basicsOfSinglyLinkedList;


public class Add1ToLinkedList {
    
}
class Node{
    Node next;
    int data;
    Node(int data){
        this.data=data;
    }
    public static Node add(Node head){
        Node cur= head;
        int sum=0;
        while(cur!=null){
            sum=sum*10+cur.data;
            cur = cur.next;
        }
        sum+=1;
        Node dummyNode = new Node(0);
        Node pre = dummyNode;
          while(sum>0){
            int rem = sum%10; 
            Node temp= new Node(rem);
            temp.next = null;
            pre.next=temp;
            pre=temp;
          }
          pre.next = null;
             
          return reverse(dummyNode.next);
    }
    public static Node add1ToLinkedList(Node head){
       // reverse head to get the cur node at a place where we want to add.
       head = reverse(head);
       Node cur = head;
   //    int carry=1;
       while(true){
           cur.data+=1;
           if(cur.data<10) return reverse(head);
           else cur.next = null;
          if(cur.next==null) break;
             else cur = cur.next; 
       }
       cur.next=new Node(1);
       return reverse(head);





    }
    private static Node reverse(Node head) {
       Node cur = head;
       Node next= null;
       Node prev  = null;
       while(cur!=null){
        next = cur.next;
        cur.next  = prev;
        prev = cur;
        cur=next;
       }
       head = prev;
       return prev;
    }
}
