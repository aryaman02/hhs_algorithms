package net.aryaman.algo.hackerrank;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Between {
    public static void main(String[] args) {
        Between bt = new Between();
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] strArray = str.split(" ");
        int a = Integer.parseInt(strArray[0]);
        int b = Integer.parseInt(strArray[1]);
        int[] arrayA = new int[a];
        int[] arrayB = new int[b];

        for (int i = 0; i < arrayA.length; i++) {
            arrayA[i] = in.nextInt();
        }
        for (int i = 0; i < arrayB.length; i++) {
            arrayB[i] = in.nextInt();
        }
        System.out.println(bt.betweenTwoSets(arrayA, arrayB));
        in.close();
    }
    public int betweenTwoSets(int[] arrayA, int[] arrayB) {
        int gcf = euclidAlgorithm2(arrayB);
        List<Integer> factors = factors(gcf);
        int numCount = 0;

        for (int i : factors) {
            int count = 0;
            for (int j = 0; j < arrayA.length; j++) {
                if (i % arrayA[j] == 0) {
                    count++;
                }
            }
            if (count == arrayA.length) {
                numCount++;
            }
        }
        return numCount;
    }
    public int euclidAlgorithm(int a, int b) {
        if (a == 0) {
            return b;
        } else if (b == 0) {
            return a;
        } else {
            return euclidAlgorithm(b, a % b);
        }
    }
    public int euclidAlgorithm2(int[] array) {
        if (array.length == 0) {
            return 0;
        } else if (array.length == 1) {
            return array[0];
        } else {
            int gcf = euclidAlgorithm(array[0], array[1]);
            for (int i = 2; i < array.length; i++) {
                gcf = euclidAlgorithm(gcf, array[i]);
            }
            return gcf;
        }
    }
    public List<Integer> factors(int n) {
        List<Integer> factors = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factors.add(i);
            }
        }
        return factors;
    }
}
