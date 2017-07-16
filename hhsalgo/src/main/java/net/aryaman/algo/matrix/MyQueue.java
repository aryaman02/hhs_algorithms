package net.aryaman.algo.matrix;

public interface MyQueue {
    /**
     * Adds an element to the end of the queue
     * @param number
     */
    public void add(int number);


    /**
     * Removes the element from the beginning of the queue, and returns.
     * If the queue is empty, then return -1;
     * @return
     */
    public int remove();

    public int peek();

    /**
     * Returns current size of the stack
     * @return
     */
    public int size();

    /**
     * Returns true if the stack is empty; false otherwise.
     * @return
     */
    public boolean isEmpty();
}
