package basicsOfDoublyLinkedList;
import java.util.ArrayList;

public class pairSumInDLL {
    
}
class Node{
    Node next;
    Node prev;
    int data;
    Node(int data){
        this.data = data;
        this.next=this.prev=null;
    }
    void append(Node head, ArrayList<Integer> ans){
        while(head!=null){
        ans.add(head.data);
        head = head.next;
        }
    }
    
    ArrayList<ArrayList<Integer>> pairSum(Node head , int sum){
        // ArrayList<Integer> arr = new ArrayList<>();
        // append(head, arr);
//         ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
//         for(int i =0; i<arr.size()-1; i++){
            
//             ArrayList<Integer> temp = new ArrayList<>();

//             if(arr.get(i)+arr.get(i+1)==sum){
//                 temp.add(arr.get(i));
//                 temp.add(arr.get(i+1));
//             }
//   ans.add(temp);
            
//         }
//         return ans;  
// the above code we have written is brute force approch to find the pair heaving the given sum.
//this question will teach you how to apply two pointer for the DLL.


     Node right = head;
     Node left  = head;
     while(head.next!=null){
        head = head.next;
     }
     ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
     right = head;
     while(left.data < right.data)
     {
        ArrayList<Integer> arr = new ArrayList<>();
        if(left.data+right.data==sum){
            arr.add(left.data);
            arr.add(right.data);
          
            left=left.next;
            right=right.prev;
        }
        else if(left.data+right.data<sum){
               left = left.next;
        }
        else{
            right=right.prev;
        }
     }
     return ans;

    }

}

