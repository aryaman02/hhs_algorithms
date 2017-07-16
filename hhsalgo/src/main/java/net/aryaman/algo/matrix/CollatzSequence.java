package net.aryaman.algo.matrix;

public class CollatzSequence {
    public static void main(String[] args) {
        CollatzSequence cs = new CollatzSequence();

        cs.generateCS(2355);
    }
    public void generateCS(int n) {
        System.out.println(n);
        int steps = 0;
        int largestVal = Integer.MIN_VALUE;

        while (n > 1) {
            if (isEven(n)) {
                n = n / 2;
                System.out.println(n);
                steps++;

            } else if (!isEven(n)) {
                n = 3*n + 1;
                System.out.println(n);
                steps++;
            }

            if (n > largestVal) {
                largestVal = n;
            }
        }
        System.out.println("Terminated after: " + steps + " steps ");
        System.out.println("The largest value was: " + largestVal);

    }
    public boolean isEven(int number) {
        return (number % 2 == 0);
    }
}
