
public class MyFlexibleQueue extends MyQueue {
    /**
     * Insert newElement after curentElement.
     * If currentElement is not present, throw a IllegalArgumentException
     *
     * @param currentElement
     * @param newElement
     */
    public void insertAfter(String currentElement, String newElement) {
        if (head == null) {
            throw new IllegalArgumentException(currentElement + " not present");
        }

        Node n = head;

        while (n != null) {

            if (!n.val.equals(currentElement)) {
                n = n.next;
                continue;
            }

            if (n == tail) {
                enqueue(newElement);
            } else {
                Node futureNode = n.next;
                Node newNode = new Node(newElement);

                n.next = newNode;
                newNode.next = futureNode;
            }
            return;
        }

        throw new IllegalArgumentException(currentElement + " not present");
    }

    /**
     * Insert newElement before first occurance of curentElement.
     * If currentElement is not present, throw a IllegalArgumentException
     *
     * @param currentElement
     * @param newElement
     */
    public void insertBefore(String currentElement, String newElement) {
        if (head == null) {
            throw new IllegalArgumentException(currentElement + " not present");
        }

        if (head.val.equals(currentElement)) {
            Node newNode = new Node(newElement);
            newNode.next = head;
            head = newNode;
            return;
        }

        Node n = head;

        while (n.next != null) {
            Node nextNode = n.next;
            if (!nextNode.val.equals(currentElement)) {
                n = n.next;
                continue;
            }

            Node newNode = new Node(newElement);
            n.next = newNode;
            newNode.next = nextNode;
            return;
        }
        throw new IllegalArgumentException(currentElement + " not present");
    }

    /**
     * Delete element and return it. If the element is not found, return null
     *
     * @param element
     */
    public String deleteElement(String element) {
        if (head == null) {
            return null;
        } else {
            if (head.val.equals(element)) {
                return dequeue();
            }
        }
        Node n = head;
        Node returnNode = null;

        while (n.next != null) {
            Node nextNode = n.next;
            if (!nextNode.val.equals(element)) {
                n = n.next;
                continue;
            }
            n.next = nextNode.next;
            returnNode = nextNode;
            if (nextNode == tail) {
                tail = n;
            }
            break;
        }
        return returnNode.val;
    }

    public static void main1(String[] args) {
        MyFlexibleQueue queue = new MyFlexibleQueue();
        queue.enqueue("1");
        queue.enqueue("2");
        queue.enqueue("3");
        queue.enqueue("4");
        queue.enqueue("5");
        queue.enqueue("6");


        queue.insertBefore("1", "9");
        queue.insertBefore("6", "10");
        try {
            //queue.insertAfter("12", "8");
            queue.insertBefore("7", "9");

        } catch (RuntimeException ex) {
            System.out.println("got exception: " + ex.getMessage());
        }
        queue.printQueue();
    }

    public static void main(String[] args) {
        MyFlexibleQueue queue = new MyFlexibleQueue();
        queue.enqueue("1");
        queue.enqueue("2");
        queue.enqueue("3");
        queue.enqueue("1");

        queue.enqueue("4");
        queue.enqueue("1");
        queue.enqueue("6");
        queue.deleteElement("6");
        queue.deleteElement("2");
        queue.insertAfter("4", "2");
        queue.enqueue("10");

        // queue.insertBefore("1", "10");
        queue.printQueue();
    }
}
