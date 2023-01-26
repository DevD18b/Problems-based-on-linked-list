package basicsOfSinglyLinkedList;

import java.util.PriorityQueue;

public class sortLL {
    
}
class ListNode{
    ListNode next;
    int data;
    ListNode(){

    }
    ListNode(int data){
        this.data=data;
    }
    
   ListNode sort(ListNode head){
       
        PriorityQueue<ListNode>pq = new PriorityQueue<>((a,b)->(a.data-b.data));
        
        ListNode cur = head;

        while(cur!=null){
            pq.offer(cur);
            cur = cur.next;
        }

        ListNode dummy = new ListNode();
          ListNode prev = dummy;
          while(!pq.isEmpty()){
            ListNode temp  = pq.poll();
            //temp.next = null;
            prev.next= temp;
            prev = temp;
          }
          prev.next =  null;

          return dummy.next;
    }
}