package basicsOfSinglyLinkedList;
import java.util.*;
public class detectPalindrome {
    
}
class Node{
    Node next;
    int data;
    Node(int data){
        this.data = data;
    }
   public static boolean isPalindrome(Node head){
    ArrayList<Integer> arr = new ArrayList<>();
    while(head.next!=null){
        arr.add(head.data);
        head = head.next;
    }
   ArrayList<Integer> arr2 = new ArrayList<>();
    for(int i = arr.size()-1; i>=0; i--){
        arr2.add(arr.get(i));
    }
    return arr.equals(arr);

   }
}
