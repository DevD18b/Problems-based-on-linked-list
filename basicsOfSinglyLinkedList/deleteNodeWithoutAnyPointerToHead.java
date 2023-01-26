package basicsOfSinglyLinkedList;

public class deleteNodeWithoutAnyPointerToHead {
    // so basically mere pass ek function hai jisme jo
    // node ko delete krna hai woh diya gaya hai.
    // and head kya hai kon hai no idea so what are we going to do is we simply.
    // apply two operation.

    public static void delete(Node nodeToBeDeleted){
        nodeToBeDeleted.data = nodeToBeDeleted.next.data;
        nodeToBeDeleted.next = nodeToBeDeleted.next.next;
    }
}
