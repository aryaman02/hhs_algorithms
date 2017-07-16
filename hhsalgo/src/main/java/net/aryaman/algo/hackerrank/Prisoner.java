package net.aryaman.algo.hackerrank;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prisoner {
    public static void main(String[] args) {
        Prisoner p = new Prisoner();
        Scanner in = new Scanner(System.in);
        String t = in.nextLine();
        List<Long> outputs = new ArrayList<>();

        for (int i = 0; i < Integer.parseInt(t); i++) {
            String s = in.nextLine();
            outputs.add(p.prisoner(s));
        }
        for (long j : outputs) {
            System.out.println(j);
        }
        in.close();
    }
    public long prisoner(String s) {
        String[] sArray = s.split(" ");
        long n = Long.parseLong(sArray[0]);
        long m = Long.parseLong(sArray[1]);
        long d = Long.parseLong(sArray[2]);
        long stop = (m + d) - 1;

        if (stop == n) {
            return stop;
        } else if (stop < n) {
            return stop % n;
        } else {
            if (stop % n == 0) {
                return n;
            } else {
                return stop % n;
            }
        }
    }
}
