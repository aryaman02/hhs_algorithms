package net.aryaman.algo.hhs9;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PROCO4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String t = in.nextLine();
        List<String> outputs = new ArrayList<>();

        for (int i = 0; i < Integer.parseInt(t); i++) {
            String str = in.nextLine();
            String[] strArray = str.split(" ");
            outputs.add(greedy(strArray[0], strArray[1]));
        }
        for (String o : outputs) {
            System.out.println(o);
        }
        in.close();
    }

    public static String greedy(String s1, String s2) {
        if (s1.equals(s2)) {
            return "Possible";
        } else {
            List<Character> s1List = new ArrayList<>();
            for (int in = 0; in < s1.length(); in++) {
                s1List.add(s1.charAt(in));
            }
            List<Character> s2List = new ArrayList<>();
            for (int in = 0; in < s2.length(); in++) {
                s2List.add(s2.charAt(in));
            }
            for (int i = s1List.size() - 1; i >= 0; i--) {
                char c = s1List.get(i);
                char c2 = s2List.get(i);
                if (c != c2) {
                    if (s1List.contains(c2)) {
                        if (i > s1List.indexOf(c2)) {
                            s1List.set(i, c2);
                        }
                    } else {
                        return "Impossible";
                    }
                }
            }
            if (s1List.equals(s2List)) {
                return "Possible";
            }
            return "Impossible";
        }
    }
}
