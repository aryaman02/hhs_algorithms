package net.aryaman.algo.misc;

public class FactorialRecurse {

    public static void main(String[] args) {
        FactorialRecurse f = new FactorialRecurse();
        int result = f.factorial(5);
        System.out.println(result);
        int val = f.tribonacci(14);
        System.out.println(val);
        int value = f.geometric(4);
        System.out.println(value);

    }

    public int factorial(int n) {

        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n-1);

        }
    }
    public int tribonacci(int x) {
        if (x <= 1) {
            return x;
        } else {
            return tribonacci(x-1) + tribonacci(x-2) + tribonacci(x-3);
        }
    }
    public int geometric(int x) {
        if (x == 1) {
            return 2;
        } else {
            int value = (geometric(x-1)) * 3;
            return value;
        }
    }


}






