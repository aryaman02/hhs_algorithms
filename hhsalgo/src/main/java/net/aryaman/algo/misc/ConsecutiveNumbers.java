package net.aryaman.algo.misc;
import java.util.Arrays;

public class ConsecutiveNumbers {
    public static void main(String[] args) {
        ConsecutiveNumbers cn = new ConsecutiveNumbers();
        cn.digitSumOfNumberRange(14, 42);
    }

    public void consecutiveNumbers(int[] array) {

        Arrays.sort(array);

        int currentmin = array[0];
        int currentmax = array[0];

        for (int i = 1; i < array.length; i++) {

            int prevValue = array[i-1];
            int curValue = array[i];

            if ((curValue == prevValue) || (curValue == prevValue+1)) {
                currentmax = curValue;

            } else {// curValue > prevValue+1
                System.out.println("[" + currentmin + " , " + currentmax + "]");
                currentmin = curValue;
                currentmax = curValue;
            }
        }
        System.out.println("[" + currentmin + " , " + currentmax + "]");
    }
    public int[] adjacentSum(int[] a1) {
        int[] a2 = new int[a1.length];
        int sum = 0;

        for (int i = 0; i < a1.length; i++) {
            sum += a1[i];
        }
        for (int j = 0; j < a1.length; j++) {
            int curSum = sum - a1[j];
            a2[j] = curSum;
        }
        return a2;
    }
    public boolean isJumpingSequence(int[] array) {
        if (array == null || array.length == 0) {
            return false;
        }
        for (int i = 1; i < array.length; i++) {
            int val = array[i];
            int prevVal = array[i-1];

            if (Math.abs(val-prevVal) == 1) {

            } else {
                return false;
            }
        }
        return true;
    }
    public void digitSumOfNumberRange(int a, int b) {
        int sumOfDigits = 0;

        for (int i = a; i <= b; i++) {
            System.out.println(i);
            sumOfDigits += sumOfDigitsOfNumber2(i);

        }
        System.out.println("The sum of the digits is: " + sumOfDigits);
    }

    public int sumOfDigitsOfNumber(String number) {
        char[] numberarray = number.toCharArray();
        int sum = 0;

        for (char c : numberarray) {

            String s = String.valueOf(c);

            int num = Integer.valueOf(s);
            sum = sum + num;
        }
        return sum;
    }

    public int sumOfDigitsOfNumber2(int number) {
        int sum = 0;

        while (number > 0) {
            int remainder = number % 10;
            number /= 10;

            sum += remainder;
        }
        return sum;
    }

}