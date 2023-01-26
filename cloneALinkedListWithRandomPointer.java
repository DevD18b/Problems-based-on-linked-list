
import java.util.HashMap;

public class cloneALinkedListWithRandomPointer {
    
}
class Node{
    int data;
    Node next;
    Node random;
    Node(int data){
        this.data = data;
        this.random =null;
    }
    Node cloneList(Node head){
        HashMap<Node,Node> map = new HashMap<>();
        for(Node cur = head; cur!=null; cur = cur.next){
            map.put(cur, new Node(cur.data));
        }
        for(Node cur = head; cur!=null; cur=cur.next){
            Node clone = map.get(cur);
            clone.next = map.get(cur.next);
            clone.random = map.get(cur.random);
        }
        return map.get(head);
    }
    // effective method.
    Node cloningList(Node head){
      Node cur = head;
      while(cur.next!=null){
        Node next = cur.next;
        cur.next = new Node(cur.data);
        cur.next.next = next;
        cur=next;
      }
      cur=head;
      for(cur = head; cur!=null; cur=cur.next){
        cur.next.random=cur.random!=null?cur.random.next:null;
      }
       Node original = head;
       Node copy = head.next;
       Node clone = copy;
       while(original!=null && copy!=null){
        original.next=original.next!=null?original.next.next:original.next;
        copy.next=copy.next!=null?copy.next.next:copy.next;
        original=original.next;
        copy=copy.next;
       }
       return clone;


    }
}
