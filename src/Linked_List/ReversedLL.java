package Linked_List;

public class ReversedLL {
    public static LinkedList.Node reverse(LinkedList.Node head){
        LinkedList.Node prev = null, curr = head, next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
