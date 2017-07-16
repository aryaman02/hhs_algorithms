package net.aryaman.algo.matrix;

public class MyArrayQueueDriver {
    public static void main(String[] args) {
        MyArrayQueue queue = new MyArrayQueue();
        queue.add(5);
        queue.add(8);
        queue.add(7);
        queue.add(3);
        queue.add(15);
        queue.add(21);
        queue.add(12);
        queue.add(19);
        queue.add(34);

        System.out.println("Removed element: " + queue.remove());

        int topElement = queue.peek();
        System.out.println("Top of queue: " + topElement);
        System.out.println("Size of queue: " + queue.size());
        System.out.println();

        while (!queue.isEmpty()) {
            int val = queue.remove();
            System.out.println(val);
        }
        queue.add(40);
        queue.add(50);
        queue.add(60);

        while (!queue.isEmpty()) {
            int val = queue.remove();
            System.out.println(val);
        }
    }

    public static void main2(String[] args) {
        MyArrayQueue queue = new MyArrayQueue();
        queue.add(5);
        queue.add(8);

        System.out.println("Size of queue: " + queue.size());
        System.out.println();

        while (!queue.isEmpty()) {
            int val = queue.remove();
            System.out.println(val);
        }
    }
}
