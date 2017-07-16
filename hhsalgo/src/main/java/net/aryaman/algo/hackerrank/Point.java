package net.aryaman.algo.hackerrank;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Point {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String cases = in.nextLine();
        List<String> outputs = new ArrayList<>();

        for (int i = 0; i < Integer.parseInt(cases); i++) {
            String str = in.nextLine();
            outputs.add(isFunnyString(str));
        }
        for (String s : outputs) {
            System.out.println(s);
        }
        in.close();
    }
    public static String isFunnyString(String str) {
        int i = 0;
        int j = str.length() - 1;
        int val1 = str.charAt(i);
        int val2 = str.charAt(i+1);
        int val3 = str.charAt(j);
        int val4 = str.charAt(j-1);

        while (i <= j) {
            System.out.println(Math.abs(val1 - val2));
            System.out.println(Math.abs(val3 - val4));
            if (Math.abs(val1 - val2) == Math.abs(val3 - val4)) {
                i++;
                j--;
            } else {
                return "Not Funny";
            }
        }
        return "Funny";
    }
}