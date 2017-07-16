package net.aryaman.algo.hhs9;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PRA4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PRA4 p = new PRA4();

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        System.out.println(p.perimeterOfTriangle(a, b, c));


    }
    public boolean isTriangle(int a, int b, int c) {
        if (a + b > c && a + c > b && b + c > a) {
            return true;
        }
        return false;
    }
    public int perimeterOfTriangle(int a, int b, int c) {
        if ((a <= 0 && b > 100) && (b <= 0 && b > 100) && (c <= 0 && c > 100)) {
            return -1;
        }
        if (isTriangle(a, b, c)) {
            return a+b+c;
        }
        List<Integer> sides = new ArrayList<>();
        sides.add(a);
        sides.add(b);
        sides.add(c);

        Collections.sort(sides);

        for (int i = sides.get(2); i >= 1; i--) {
            for (int j = sides.get(1); j >= 1; j--) {
                for (int k = sides.get(0); k >= 1; k--) {
                    if (isTriangle(k, j, i)) {
                        return i+j+k;
                    }
                }
            }
        }
        return -1;
    }

}
