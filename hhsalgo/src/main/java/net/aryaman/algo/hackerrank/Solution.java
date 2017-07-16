package net.aryaman.algo.hackerrank;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String t = in.nextLine();
        List<String> outputs = new ArrayList<>();
        for(int a0 = 0; a0 < Integer.parseInt(t); a0++){
            String s = in.nextLine();
            String output = "";
            if (s.length() % 2 != 0) {
                output = "NO";
            } else {
                int i = 0;
                int j = s.length() - 1;
                while (i < j) {
                    String s1 = Character.toString(s.charAt(i));
                    String s2 = Character.toString(s.charAt(j));
                    if (s1.equals("{") && s2.equals("}")) {
                        i++;
                        j--;
                    } else if (s1.equals("(") && s2.equals(")")) {
                        i++;
                        j--;
                    } else if (s1.equals("[") && s2.equals("]")) {
                        i++;
                        j--;
                    } else {
                        output = "NO";
                        break;
                    }
                    if (i >= j) {
                        output = "YES";
                    }
                }
            }
            outputs.add(output);
        }
        for (String str : outputs) {
            System.out.println(str);
        }
    }
}