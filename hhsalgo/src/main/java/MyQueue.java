
public class MyQueue {

    /**
     * MyQueue Node
     * @author aryamandas
     *
     */
    static class Node {
        String val;

        Node next;

        public Node(String val) {
            this.val = val;
        }
    }

    protected Node head;
    protected Node tail;

    public MyQueue() {
        this.head = null;
        this.tail = null;
    }

    /**
     * Enqueue item to tail of MyQueue
     * @param item
     */
    public void enqueue(String item) {
        Node n = new Node(item);

        if (head == null) {
            // empty
            head = n;
            tail = n;
        } else {
            tail.next = n;
            tail = n;
        }
    }

    /**
     * Dequeue item from head of MyQueue
     * @return
     */
    public String dequeue() {
        if (head == null) {
            return null;
        } else {
            Node n = head;

            if (head == tail) {
                tail = null;
                head = null;
            } else {
                head = n.next;

            }
            return n.val;
        }
    }

    /**
     * return true if MyQueue is empty; false otherwise
     * @return
     */
    public boolean isEmpty() {
        if (head == null) {
            return true;
        } else {
            return false;
        }
    }
    /**
     * Return MyQueue size
     */
    public int size() {
        if (head == null) {
            return 0;

        } else if (head == tail) {
            return 1;

        } else {
            int count = 1;
            Node n = head;

            while (n != tail) {
                n = n.next;
                count++;
            }
            return count;
        }
    }

    public void printQueue() {
        if (head == null) {
            return;
        } else {
            Node n = head;
            while (n != null) {
                System.out.println(n.val);
                n = n.next;
            }
            //System.out.println(tail.val);
        }
    }

    public static void main(String[] args) {
        MyQueue queue = new MyQueue();

        System.out.println("Status of queue: " + queue.isEmpty());
        System.out.println("Current size of queue: " + queue.size());

        queue.enqueue("A");
        queue.enqueue("B");
        queue.enqueue("C");
        queue.enqueue("D");

        System.out.println("\n");
        queue.printQueue();

        System.out.println("Status of queue: " + queue.isEmpty());
        System.out.println("Current size of queue: " + queue.size());

        String s = queue.dequeue();
        System.out.println("Element popped: " + s);

        System.out.println("Current size of queue: " + queue.size());




    }
}
