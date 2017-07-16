package net.aryaman.algo.matrix;

public class MyArrayStackDriver {

    public static void main0(String[] args) {
        MyStack stack = new MyArrayStack();

        stack.push(2);

        stack.pop();
        stack.pop();



        stack.push(3);
        stack.push(5);
        stack.push(7);
        stack.push(12);
        int top = stack.peek();
        System.out.println("Top of the stack is: " + top);
        boolean flag = stack.isEmpty();
        System.out.println(flag);

        System.out.println("stack size: " + stack.size());


        while (!stack.isEmpty()) {
            int val = stack.pop();
            System.out.println(val);
        }

    }

    public static void main1(String[] args) {
        MyStack stack = new MyArrayStack();

        stack.push(2);
        stack.push(2);
        stack.push(2);
        stack.push(2);
        stack.push(2);
        stack.push(2);
        stack.push(2);
        stack.push(2);

        stack.push(2);
        stack.push(2);
        stack.push(2);
        stack.push(2);
        stack.push(2);
        System.out.println("stack size: " + stack.size());

    }

    public static void main3(String[] args) {
        int val = 0;

        //System.out.println(val++);
        //System.out.println(val);

        int otherval = 0;

        System.out.println(++otherval);
        System.out.println(otherval);


    }

    public static void main(String[] args) {
        MyStack stackA = new MyArrayStack();

        MyStack stackB = new MyArrayStack();

        for (int i = 1; i <=10; i++) {
            stackA.push(i);
        }

        for (int i = 101; i <= 120; i++) {
            stackB.push(i);
        }

        System.out.println("stackA size: " + stackA.size());

        System.out.println("stackB size: " + stackB.size());

        System.out.println("stackA top element: " + stackA.peek());

        System.out.println("stackB top element: " + stackB.peek());
    }
}
