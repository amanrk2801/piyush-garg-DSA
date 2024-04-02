package LinkedList;

class Node {
    public int data;
    public Node next = null;

    public Node(int data) {
        this.data = data;
    }
}

public class MyLinkedList {
    private Node head;
    private Node tail;

    public MyLinkedList() {
        head = null;
        tail = null;
    }

    public void insert(int value) {
        Node node = new Node(value);
        if (isEmpty()) {
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
    }

    public int sum() {
        Node current = head;
        int sum = 0;
        while (current != null) {
            sum += current.data;
            current = current.next;
        }
        return sum;
    }

    public int indexOf(int value) {
        int index = 0;
        Node current = head;

        while (current != null) {
            if (current.data == value) return index;
            index++;
            current = current.next;
        }
        return -1;
    }

    public void insertFirst(int value) {
        Node node = new Node(value);
        if (isEmpty()) {
            insert(value);
            return;
        }
        node.next = head;
        head = node;
    }

    public boolean isEmpty() {
        return head == null && tail == null;
    }

    public void insertAt(int index, int value) {
        if (isEmpty()) throw new IllegalArgumentException();

        Node node = new Node(value);
        Node current = head;
        Node prev = null;

        while (index > 0 && current != null) {
            prev = current;
            current = current.next;
            index--;
        }
        prev.next = node;
        node.next = current;
    }

    public void reverse() {
        if (head == null || head.next == null) return;
        Node prev = null;
        Node current = head;
        Node next = head.next;

        while (next != null) {
            current.next = prev;
            prev = current;
            current = next;
            next = next.next;
        }
        current.next = prev;
        head = current;
    }

    public void removeStart() {
        if (isEmpty()) return;

        Node temp = head;
        head = head.next;
        temp.next = null;
    }

    public void removeLast() {
        if (isEmpty()) return;

        if (head == tail) {
            head = tail = null;
            return;
        }
        Node current = head;
        while (current.next != tail) {
            current = current.next;
        }
        current.next = null;
        tail = current;

    }

    public void removeNthFromEnd(int n) {
        if (isEmpty()) return;
        if (head.next==null){
            head=null;
            return;
        }
        int totalNodes = 0;
        Node current = head;
        while (current != null) {
            totalNodes++;
            current = current.next;
        }
        int indexFromFront = totalNodes - n + 1;
        Node prev = null;
        current = head;
        while (indexFromFront > 1 && current != null) {
            prev = current;
            current = current.next;
            indexFromFront--;
        }

        if (prev==null){
            head=current.next;
            current.next=null;
            return;
        }
        prev.next = current.next;
        current.next = null;
    }

    public void removeNthFromEndFast(int n){
        if (isEmpty()) return;
        if (head.next==null){
            head=null;
            return;
        }
        Node fast =head;
        Node current = head;
        Node prev = null;

        while (n>1 && fast!=null){
            fast=fast.next;
            n--;
        }
        while (fast.next!=null){
            prev=current;
            current=current.next;
            fast=fast.next;
        }
        if (prev==null){
            head=current.next;
            current.next=null;
            return;
        }
        prev.next=current.next;
        current.next=null;
    }

    public Node reverseRec(Node head){
        if (head==null || head.next==null) return head;

        Node rest = reverseRec(head.next);

        Node next = head.next;
        next.next=head;
        head.next=null;

        return rest;
    }

    public void reverseRec(){
        head = reverseRec(head);
    }

    public void printRec(Node head){
        if (head==null) return;

        printRec(head.next);
        System.out.print(head.data + "->");

    }

    public void printRec(){
        printRec(head);
    }



    public String toString() {
        Node current = head;
        StringBuilder result = new StringBuilder();

        while (current != null) {
            result.append(current.data);
            if (current.next != null)
                result.append("->");
            current = current.next;
        }
        return result.toString();
    }
}
