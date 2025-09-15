package Linked_List;

public class LinkedList {

    Node head;
    int length;

    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void add(int data){
        Node newNode = new Node(data);
        this.length = ++length;

        if(head == null){
            head = newNode;
        }
        else{
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void reverse(){
        head = ReversedLL.reverse(head);
    }

    public boolean detectCycle(){
        return DetectCycle.detectCycle(head);
    }

    public void printList(){
        Node current = head;
        while(current != null){
            System.out.print(current.data + ", ");
            current = current.next;
        }
    }

    // add two linkedList

    public LinkedList mergeLinkedList(LinkedList l1,LinkedList l2){
        Node curr1 = l1.head;
        Node curr2 = l2.head;
        LinkedList ll = new LinkedList();
        while(curr2 != null && curr1 != null){
            if(curr1.data > curr2.data){
                ll.add(curr2.data);
                curr2 = curr2.next;
            }
            else{
                ll.add(curr1.data);
                curr1 = curr1.next;
            }
        }
        while(curr2 != null){
            ll.add(curr2.data);
            curr2 = curr2.next;
        }
        while(curr1 != null){
            ll.add(curr1.data);
            curr1 = curr1.next;
        }
        return ll;
    }

    public void removeLastNthNode(int n){
        int len = this.length - n - 1;
        Node slow = head;
        for(int i = 0;i < len;i++){
            slow = slow.next;
        }
        slow.next = slow.next.next;
        --length;
    }




    public static void main(String[] args) {
        LinkedList ll1 = new LinkedList();
        LinkedList ll2 = new LinkedList();
        ll1.add(1);
        ll1.add(2);
        ll1.add(4);

        ll2.add(1);
        ll2.add(3);
        ll2.add(4);
        ll2.add(5);

//        System.out.println(ll2.length);

//        LinkedList merged = ll2.mergeLinkedList(ll1,ll2);

//        merged.printList();

        ll2.removeLastNthNode(2);
        ll2.printList();

    }
}
