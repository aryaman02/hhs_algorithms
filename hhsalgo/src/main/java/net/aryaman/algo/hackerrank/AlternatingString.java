package net.aryaman.algo.hackerrank;
import java.util.Scanner;
import java.util.Stack;

public class AlternatingString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        int length = 0;
        Stack<Integer> lengths = new Stack<>();

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) != str.charAt(i+1)) {
                length++;
            } else {
                lengths.push(length);
                length = 0;
            }
            if (str.charAt(i) != str.charAt(i+1) && i+1 == str.length() - 1) {
                length++;
                lengths.push(length);
                length = 0;
            }
        }
        System.out.println(lengths.peek());
        in.close();
    }
}
