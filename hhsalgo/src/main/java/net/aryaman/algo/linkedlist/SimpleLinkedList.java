package net.aryaman.algo.linkedlist;

/**
 * @author aryamandas
 *
 */
public class SimpleLinkedList {

    private static class Node {
        public Node(int val) {
            super();
            this.val = val;
        }

        public int val;
        public Node next;
    }

    private Node head;
    private Node tail;

    public void buildLinkedList() {
        /*
         * let us build a linked-list of 3 nodes
         * n1 (10), n2 (22), n3 (37)
         */

        Node n1 = new Node(10);
        head = n1;
        tail = n1;

        Node n2 = new Node(22);
        n1.next = n2;
        tail = n2;

        Node n3 = new Node(37);
        n2.next = n3;
        tail = n3;

    }

    public void buildLinkedList(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }

        Node n = new Node(array[0]);
        head = n;
        tail = n;

        for (int index = 1; index < array.length; index++) {
            Node newNode = new Node(array[index]);
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void showLinkedList() {
        Node iter = head;

        while (true) {
            System.out.println("curNode: " + iter + "  val: " + iter.val + " next: " + iter.next);
            iter = iter.next;

            if (iter == null) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        SimpleLinkedList ll = new SimpleLinkedList();
        ll.buildLinkedList(new int[] {10, 20, 30, 40, 50});

        ll.showLinkedList();
    }

}
