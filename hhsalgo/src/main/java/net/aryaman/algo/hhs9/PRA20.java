package net.aryaman.algo.hhs9;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class PRA20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PRA20 p = new PRA20();
        String cases = in.nextLine();
        List<Integer> outputs = new ArrayList<>();

        for (int i = 0; i < Integer.parseInt(cases); i++) {
            String str = in.nextLine();
            outputs.add(p.subsets2(str));
        }
        for (int j : outputs) {
            System.out.println(j);
        }
        in.close();
    }
    public String decimalToBinary(int number, int size) {
        StringBuilder sb = new StringBuilder();

        while (number > 0) {
            int remainder = number % 2;
            number /= 2;
            sb.append(remainder);
        }

        int zerosToFill = size - sb.length();
        for (int i = 0; i < zerosToFill; i++) {
            sb.append(0);
        }
        sb.reverse();
        return sb.toString();
    }
    public int subsets(String s) {
        String[] sArray = s.split(" ");
        List<Integer> array = new ArrayList<>();

        for (String str : sArray) {
            array.add(Integer.parseInt(str));
        }
        List<String> binaries = new ArrayList<>();

        for (int i = 1; i < Math.pow(2, array.size()); i++) {
            binaries.add(decimalToBinary(i, array.size()));
        }
        int count = 0;
        Set<String> elems = new LinkedHashSet<>();

        for (String str : binaries) {
            char[] elemArray = str.toCharArray();
            StringBuilder sb = new StringBuilder();
            for (int k = 0; k < elemArray.length; k++) {
                if (elemArray[k] == '1') {
                    sb.append(array.get(k));
                }
            }
            elems.add(sb.toString());
        }

        for (String t : elems) {
            int sum = 0;
            int product = 1;
            for (int in = 0; in < t.length(); in++) {
                int val = Integer.parseInt(t.charAt(in) + "");
                product *= val;
                sum += val;
            }
            if (sum > product) {
                count++;
            }
        }
        return count;
    }

    public int subsets2(String s) {
        String[] sArray = s.split(" ");
        List<Integer> array = new ArrayList<>();

        for (String str : sArray) {
            array.add(Integer.parseInt(str));
        }

        int count = 0;

        Set<String> elems = new LinkedHashSet<>();

        for (int i = 1; i < Math.pow(2, array.size()); i++) {
            String binary = decimalToBinary(i, array.size());

            char[] elemArray = binary.toCharArray();
            StringBuilder sb = new StringBuilder();
            for (int k = 0; k < elemArray.length; k++) {
                if (elemArray[k] == '1') {
                    sb.append(array.get(k));
                }
            }
            elems.add(sb.toString());
        }

        for (String t : elems) {

            int sum = 0;
            int product = 1;
            for (int in = 0; in < t.length(); in++) {
                int val = Character.digit(t.charAt(in), 10);
                product *= val;
                sum += val;
            }
            if (sum > product) {
                count++;
            }

        }
        return count;
    }
}
