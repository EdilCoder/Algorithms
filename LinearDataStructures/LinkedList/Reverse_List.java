public class Reverse_List {

    public static class ListNode{

        int val;
        ListNode next;

        public ListNode(){}

        public ListNode(int val){
            this.val = val;
        }
    }
    
    public static ListNode reverseList(ListNode head){

        ListNode cur = head;
        ListNode prev = null;
        ListNode temp = null;

        while(cur!=null){

            temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }

        return prev;

    }


    public static void main(String[] args) {
        //1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original List:");
        printList(head);

        ListNode reversedHead = reverseList(head);

        System.out.println("Reversed List:");
        printList(reversedHead);
    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}
