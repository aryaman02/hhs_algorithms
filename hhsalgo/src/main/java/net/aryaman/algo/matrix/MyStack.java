package net.aryaman.algo.matrix;

public interface MyStack {
    /**
     * Pushes an element
     * @param number
     */
    public void push(int number);


    /**
     * Pops the top element from the stack, and returns.
     * If the stack is empty, then return -1;
     * @return
     */
    public int pop();

    /**
     * Returns the top element from the stack, without popping.
     * If the stack is empty, then return -1;
     * @return
     */
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


    /**
     * @param number
     */
}
