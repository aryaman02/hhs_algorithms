package net.aryaman.algo.hackerrank;
import java.util.Scanner;

public class Exploration {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Exploration e = new Exploration();
        String s = in.nextLine();
        System.out.println(e.exploration(s));
        in.close();
    }
    public int exploration(String s) {
        String sos = "SOS";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != sos.charAt(i % 3)) {
                count++;
            }
        }
        return count;
    }
}
