package net.aryaman.algo.hackerrank;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Construction {
    public static void main(String[] args) {
        Construction c = new Construction();
        Scanner in = new Scanner(System.in);
        String t = in.nextLine();
        List<Integer> outputs = new ArrayList<>();

        for (int i = 0; i < Integer.parseInt(t); i++) {
            String str = in.nextLine();
            outputs.add(c.constructString(str));
        }
        for (int j : outputs) {
            System.out.println(j);
        }
        in.close();
    }
    public int constructString(String s) {
        Set<Character> chars = new LinkedHashSet<>();

        for (int i = 0; i < s.length(); i++) {
            chars.add(s.charAt(i));
        }
        return chars.size();
    }
}
