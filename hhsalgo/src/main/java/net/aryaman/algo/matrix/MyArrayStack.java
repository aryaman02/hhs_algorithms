package net.aryaman.algo.matrix;


public class MyArrayStack implements MyStack {
    private int[] stackArray = new int[8];
    private int currentElementIndex = -1;

    @Override
    public void push(int number) {
        if (currentElementIndex >= stackArray.length-1) {
            int[] newStackArray = new int[stackArray.length+16];

            for (int i = 0; i < stackArray.length; i++) {
                newStackArray[i] = stackArray[i];
            }
            stackArray = newStackArray;
        }

        stackArray[++currentElementIndex] = number;
    }

    @Override
    public int pop() {
        if (currentElementIndex == -1) {
            System.out.println("Stack is empty");
            return -1;
        }

        int poppedValue = stackArray[currentElementIndex];
        currentElementIndex--;
        return poppedValue;
    }


    @Override
    public int size() {
        return currentElementIndex+1;
    }

    @Override
    public int peek() {
        if (currentElementIndex == -1) {
            return -1;
        }
        return stackArray[currentElementIndex];
    }

    @Override
    public boolean isEmpty() {
        if (currentElementIndex == -1) {
            return true;
        } else {
            return false;
        }
    }
}
