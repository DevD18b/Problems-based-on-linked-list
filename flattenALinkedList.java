import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class flattenALinkedList {
    
    public static Node flatten(Node head){
        if(head.next==null){
            return head;
        }
        head.next = flatten(head.next);
        head  =   merge(head,head.next);
        return head;
    }
    public static Node merge(Node a , Node b){

        ArrayList<Integer> ans = new ArrayList<>();
        Collections.sort(ans,Collections.reverseOrder());
        Node cur = new Node(0);
        Node res  = cur;
        while(a!=null && b!=null){
            if(a.data<=b.data){
                cur.bottom = a;
                cur=cur.bottom;
                a=a.bottom;
            }
            else{
                cur.bottom = b;
                cur=cur.bottom;
                b=b.bottom;
            }
        }
        if(a!=null) cur.bottom = a;
        else
        cur.bottom = b;
        return res.bottom;

    }
}
class Node{
    int data;
    Node next;
    Node bottom;
    Node(int data){
        this.data = data;
        this.next = this.bottom = null;
    }
}
