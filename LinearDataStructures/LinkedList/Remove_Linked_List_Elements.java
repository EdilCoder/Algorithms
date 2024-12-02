public class Remove_Linked_List_Elements {

    public static class ListNode {
        int val;
        ListNode next;

        public ListNode() {}

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode removeElement(ListNode head, int val){
        if (head == null) {
            return null;
        }
        
        ListNode dummy = new ListNode();
        dummy.next = head;

        ListNode cur = dummy;
        while(cur.next != null){

            if(cur.next.val == val){
                cur.next = cur.next.next;
            }else{
                cur = cur.next;
            }

        }

        return dummy.next;

    }

    public static void main(String[] args) {
        //Linked_List: 1 -> 2 -> 6 -> 3 -> 4 -> 5 -> 6
        ListNode head = new ListNode(1,
                        new ListNode(2,
                        new ListNode(6,
                        new ListNode(3,
                        new ListNode(4,
                        new ListNode(5,
                        new ListNode(6)))))));

        System.out.println("Original Linked List:");
        printList(head);

        // Remove element 6
        int valToRemove = 6;
        head = removeElement(head, valToRemove);

        System.out.println("Linked List after removing " + valToRemove + ":");
        printList(head);
    }

    // Print Linked_List
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }
}
