package net.aryaman.algo.hhs9;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PROCO3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        List<Integer> outputs = new ArrayList<>();

        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            outputs.add(bitManipulation(n));
        }
        for (int o : outputs) {
            System.out.println(o);
        }
        in.close();
    }
    public static int bitManipulation(int n) {
        if (n <= 0) {
            return 0;
        }
        int pow = 1;
        int sum = 0;
        while (n != 0) {
            pow *= 5;
            int r = n % 2;
            if (r == 1) {
                sum += pow;
            }
            n /= 2;
        }
        return sum;
    }
}
