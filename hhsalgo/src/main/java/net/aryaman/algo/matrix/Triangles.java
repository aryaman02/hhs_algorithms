package net.aryaman.algo.matrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Triangles {
    public static void main(String[] args) {
        Triangles t = new Triangles();
        t.printTriangle(4);
        t.printInvertedTriangle(4);
        t.printReflectedTriangle(4);
        t.printRegularTriangle(4);
    }

    public void printTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void printInvertedTriangle(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void printReflectedTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(' ');
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
    public void printRegularTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= 2*i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public Set<Integer> listFactors(int number) {
        Set<Integer> factors = new HashSet<>();

        for (int i = 1; i <= number; i++) {
            int remainder = number % i;

            if (remainder == 0) {
                factors.add(i);
                int result = number / i;
                factors.add(result);
            }
        }
        return factors;
    }

    public int[] listFactors2(int number) {
        List<Integer> factors = new ArrayList<>();
        int i = 1;

        while (i * i <= number) {
            int remainder = number % i;

            if (remainder == 0) {
                factors.add(i);

                if (i * i != number) {
                    int result = number / i;
                    factors.add(result);
                }
            }
            i++;
        }

        int[] factorArray = new int[factors.size()];

        for (int j = 0; j < factorArray.length; j++) {
            int element = factors.get(j);
            factorArray[j] = element;
        }

        Arrays.sort(factorArray);
        return factorArray;
    }
}
