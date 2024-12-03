public class My_Linked_List {

    public static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

    public static class MyLinkedList {

        int size;
        ListNode dummy; // Dummy head node

        public MyLinkedList() {
            size = 0;
            dummy = new ListNode(0); // Initialize dummy head
        }

        public int get(int index) {
            // Check if the index is valid
            if (index < 0 || index >= size) {
                return -1;
            }

            ListNode cur = dummy.next; // Start from the first actual node
            for (int i = 0; i < index; i++) {
                cur = cur.next; // Move to the next node
            }

            return cur.val; // Return the value at the target index
        }

        public void addAtHead(int val) {
            // Create a new node and insert it after the dummy head
            ListNode newNode = new ListNode(val);
            newNode.next = dummy.next;
            dummy.next = newNode;
            size++; // Update the size of the linked list
        }

        public void addAtTail(int val) {
            // Create a new node and traverse to the tail
            ListNode newNode = new ListNode(val);
            ListNode cur = dummy;
            while (cur.next != null) {
                cur = cur.next;
            }

            cur.next = newNode; // Link the new node to the tail
            size++; // Update the size of the linked list
        }

        public void addAtIndex(int index, int val) {
            // If index is greater than size, do nothing
            if (index > size) {
                return;
            }
            // If index is less than 0, treat it as inserting at the head
            if (index < 0) {
                index = 0;
            }

            // Traverse to the node before the target position
            ListNode newNode = new ListNode(val);
            ListNode pred = dummy;
            for (int i = 0; i < index; i++) {
                pred = pred.next;
            }

            // Insert the new node
            newNode.next = pred.next;
            pred.next = newNode;

            size++; // Update the size of the linked list
        }

        public void deleteAtIndex(int index) {
            // If index is invalid, do nothing
            if (index >= size || index < 0) {
                return;
            }

            // Traverse to the node before the target position
            ListNode cur = dummy;
            for (int i = 0; i < index; i++) {
                cur = cur.next;
            }

            // Remove the target node
            cur.next = cur.next.next;

            size--; // Update the size of the linked list
        }
    }

    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();

        // Test adding to the head
        linkedList.addAtHead(1); // Linked list: 1
        System.out.println("Added 1 at head. Linked list: " + printList(linkedList));

        // Test adding to the tail
        linkedList.addAtTail(3); // Linked list: 1 -> 3
        System.out.println("Added 3 at tail. Linked list: " + printList(linkedList));

        // Test inserting at index 1
        linkedList.addAtIndex(1, 2); // Linked list: 1 -> 2 -> 3
        System.out.println("Added 2 at index 1. Linked list: " + printList(linkedList));

        // Test getting a value
        int valueAt1 = linkedList.get(1); // Returns 2
        System.out.println("Value at index 1: " + valueAt1);

        // Test deleting a node at index 1
        linkedList.deleteAtIndex(1); // Linked list: 1 -> 3
        System.out.println("Deleted node at index 1. Linked list: " + printList(linkedList));

        // Test getting a value after deletion
        int valueAt1AfterDelete = linkedList.get(1); // Returns 3
        System.out.println("Value at index 1 after delete: " + valueAt1AfterDelete);

        // Test adding to the head
        linkedList.addAtHead(0); // Linked list: 0 -> 1 -> 3
        System.out.println("Added 0 at head. Linked list: " + printList(linkedList));

        // Test inserting at an invalid index
        linkedList.addAtIndex(10, 4); // Invalid operation
        System.out.println("Attempted to add at invalid index 10. Linked list: " + printList(linkedList));

        // Test deleting at an invalid index
        linkedList.deleteAtIndex(-1); // Invalid operation
        System.out.println("Attempted to delete at invalid index -1. Linked list: " + printList(linkedList));
    }

    // Helper method: Print the linked list
    private static String printList(MyLinkedList linkedList) {
        StringBuilder sb = new StringBuilder();
        ListNode cur = linkedList.dummy.next;
        while (cur != null) {
            sb.append(cur.val).append(" -> ");
            cur = cur.next;
        }
        sb.append("null");
        return sb.toString();
    }
}
