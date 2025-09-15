package Linked_List;

public class DetectCycle extends LinkedList{

    public static boolean detectCycle(LinkedList.Node head){
        LinkedList.Node slow = head, fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow == fast;
    }
}
