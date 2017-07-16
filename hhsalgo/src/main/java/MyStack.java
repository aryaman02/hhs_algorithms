

public class MyStack {
    static class Node {
        String val;

        Node next;

        public Node(String val) {
            this.val = val;
        }
    }
    private Node top;

    public MyStack() {
        this.top = null;
    }
    public void push(String element) {
        Node n = new Node(element);

        if (top == null) {
            top = n;
        } else {
            n.next = top;
            top = n;
        }
    }
    public String pop() {
        if (top == null) {
            return null;
        } else {
            Node topNode = top;
            top = top.next;
            return topNode.val;
        }
    }
    public boolean isEmpty() {
        return (top == null);
    }
    public int size() {
        if (top == null) {
            return 0;
        } else {
            int count = 0;
            Node n = top;

            while (n != null) {
                n = n.next;
                count++;
            }
            return count;
        }
    }
    public void printStack() {
        if (top == null) {
            return;
        } else {
            Node n = top;
            while (n != null) {
                System.out.println(n.val);
                n = n.next;
            }
        }
    }
    public static void main(String[] args) {
        MyStack ms = new MyStack();
        ms.push("1");
        ms.push("3");
        ms.push("5");
        ms.push("7");
        ms.push("9");
        System.out.println(ms.pop());
        System.out.println(ms.pop());
        System.out.println("------------");
        ms.printStack();
        System.out.println("Status of stack: " + ms.isEmpty());
        System.out.println("Size of stack: " + ms.size());
    }
}

