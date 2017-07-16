package net.aryaman.algo.matrix;

public class MyArrayQueue implements MyQueue {
    private int[] queueArray = new int[3];
    private int currentElementIndex = -1;

    @Override
    public void add(int number) {
        if (currentElementIndex >= queueArray.length-1) {
            int[] newQueueArray = new int[queueArray.length+4];

            for (int i = 0; i < queueArray.length; i++) {
                newQueueArray[i] = queueArray[i];
            }
            queueArray = newQueueArray;
        }
        currentElementIndex++;
        queueArray[currentElementIndex] = number;

    }

    @Override
    public int remove() {
        if (currentElementIndex == -1) {
            System.out.println("Queue is empty");
            return -1;
        }
        int removedVal = queueArray[0];

        for (int i = 1; i <= currentElementIndex; i++) {
            queueArray[i-1] = queueArray[i];
        }
        currentElementIndex--;
        return removedVal;
    }

    @Override
    public int peek() {
        if (currentElementIndex == -1) {
            return -1;
        }
        return queueArray[0];
    }

    @Override
    public int size() {
        return currentElementIndex+1;
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
