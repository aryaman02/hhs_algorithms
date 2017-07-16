package net.aryaman.algo.hackerrank;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;


public class Common {
    public static void main(String[] args) {
        Common c = new Common();
        Scanner in = new Scanner(System.in);
        String t = in.nextLine();
        List<String> outputs = new ArrayList<>();

        for (int i = 0; i < Integer.parseInt(t); i++) {
            String a = in.nextLine();
            String b = in.nextLine();
            outputs.add(c.common(a,b));
        }
        for (String str : outputs) {
            System.out.println(str);
        }
        in.close();
    }
    public String common(String a, String b) {
        Set<Character> chars = new LinkedHashSet<>();

        for (int i = 0; i < a.length(); i++) {
            chars.add(a.charAt(i));
        }
        for (int j = 0; j < b.length(); j++) {
            if (chars.contains(b.charAt(j))) {
                return "YES";
            }
        }
        return "NO";
    }
}
