package LinkedList.Leetcode;

/*https://leetcode.com/problems/swap-nodes-in-pairs/description/*/
class ListNode {
    int val;
    ListNod next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNod next) {
        this.val = val;
        this.next = next;
    }
}

public class SwapNodes {
    public static void main(String[] args) {
        // Create a sample linked list
        ListNod head = new ListNod(1);
        head.next = new ListNod(2);
        head.next.next = new ListNod(3);
        head.next.next.next = new ListNod(4);

        System.out.println("Original linked list:");
        printList(head);

        // Swap pairs
        ListNod swappedHead = swapPairs(head);

        System.out.println("\nLinked list after swapping pairs:");
        printList(swappedHead);
    }

    public static ListNod swapPairs(ListNod head) {
        if (head == null || head.next == null) return head;

        ListNod restOfTheList = swapPairs(head.next.next);

        ListNod secondOne = head.next;
        secondOne.next = head;
        head.next = restOfTheList;

        return secondOne;
    }

    private static void printList(ListNod head) {
        ListNod curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}
