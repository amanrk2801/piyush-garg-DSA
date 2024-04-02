package LinkedList.Leetcode;

// Definition for a singly-linked list node
class ListNod {
    int val;
    ListNod next;
    ListNod(int x) { val = x; }
}

public class ReverseLinkedListKGroups {

    // Method to reverse a linked list in groups of k
    public static ListNod kReverse(ListNod head, int k) {
        if (head == null || head.next == null) return head;

        // Handle first k elements
        ListNod prev = null;
        ListNod next = null;
        ListNod current = head;

        int count = 0;
        while (count < k && current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }

        // If less than k elements left, reverse them back
        if (count < k) {
            return reverse(prev);
        }

        // Recursively reverse next k elements
        head.next = kReverse(current, k);

        return prev;
    }

    // Helper method to reverse a linked list
    private static ListNod reverse(ListNod head) {
        ListNod prev = null;
        ListNod current = head;
        while (current != null) {
            ListNod next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    // Method to print the elements of a linked list
    public static void printList(ListNod head) {
        ListNod current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Test the implementation
        ListNod head = new ListNod(1);
        head.next = new ListNod(2);
        head.next.next = new ListNod(3);
        head.next.next.next = new ListNod(4);
        head.next.next.next.next = new ListNod(5);

        System.out.println("Original list:");
        printList(head);

        int k = 2; // Group size
        head = kReverse(head, k);

        System.out.println("List after reversing in groups of " + k + ":");
        printList(head);
    }
}
