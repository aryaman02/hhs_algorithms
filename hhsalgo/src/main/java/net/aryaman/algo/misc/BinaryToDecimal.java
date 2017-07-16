package net.aryaman.algo.misc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinaryToDecimal {
    public static void main(String[] args) {
        BinaryToDecimal bd = new BinaryToDecimal();
        bd.decimalToBinary(13);
    }

    public void binaryToDecimal(String binary) {
        char[] binaryarray = binary.toCharArray();

        int decimal = 0;
        for (char c : binaryarray) {
            String s = String.valueOf(c);
            int value = Integer.valueOf(s);
            decimal = decimal * 2 + value;
        }
        System.out.println(decimal);
    }
    public void decimalToBinary(int number) {
        List<Integer> binaryList = new ArrayList<>();

        while (number > 0) {
            int remainder = number % 2;
            number /= 2;
            binaryList.add(remainder);
        }
        Collections.reverse(binaryList);

        for (int i : binaryList) {
            System.out.print(i);
        }
        System.out.println();
    }
    public String decimalToHex(int number) {
        List<Character> hexadecimal = new ArrayList<>();

        while (true) {
            int remainder = number % 16;
            number /= 16;

            char c = Character.forDigit(remainder, 16);
            hexadecimal.add(c);

            if (number == 0) {
                break;
            }
        }
        Collections.reverse(hexadecimal);

        StringBuilder sb = new StringBuilder("0x");

        for (char c : hexadecimal) {
            sb.append(c);
        }

        return sb.toString();
    }

    public void hexToDecimal(String hexadecimal) {
        char[] hexArray = hexadecimal.toCharArray();
        int hexadecimal2 = 0;

        for (char c : hexArray) {
            String s = String.valueOf(c);
            int val = Integer.valueOf(s, 16);
            hexadecimal2 = hexadecimal2 * 16 + val;
        }
        System.out.println(hexadecimal2);
    }
}
