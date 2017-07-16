package net.aryaman.algo.misc;

import java.util.ArrayList;
import java.util.List;

public class SumofDigits {

    public void add(String number) {
        char[] numberarray = number.toCharArray();
        int sum = 0;

        for (char c : numberarray) {
            String s = String.valueOf(c);
            int num = Integer.valueOf(s);

            List<Integer> numberlist = new ArrayList<Integer>();
            numberlist.add(num);

            for (int i : numberlist) {
                sum = sum + i;

            }
        }
        System.out.println("The sum of the digits is: " + sum);
    }
    public static void main(String[] args) {
        SumofDigits sd = new SumofDigits();

        for (int i = 1; i < 10000; i++) {
            String number = String.valueOf(i);
            if (sd.isArmStrongNumber(number)) {
                System.out.println(i  + " is Armstrong number");
            }
        }
        //System.out.println(sd.isArmStrongNumber("4"));
        //sd.floydTriangle(7);
    }
    public boolean isArmStrongNumber(String number) {
        char[] numarray = number.toCharArray();
        int sum = 0;

        for (char c : numarray) {
            String s = String.valueOf(c);
            int number2 = Integer.valueOf(s);
            sum = sum + number2;
        }

        //System.out.println(sum);

        int count = numarray.length;

        double resultDouble = Math.pow(sum, count);

        int result = (int) resultDouble;

        String resultString = String.valueOf(result);

        //System.out.println(resultString);

        if (number.equals(resultString)) {
            return true;

        } else {
            return false;
        }

    }
    public void floydTriangle(int rows) {
        int number = 1;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }
}