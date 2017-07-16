package net.aryaman.algo.hhs9;
import java.util.Arrays;
import java.util.Scanner;

public class PRB20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PRB20 p = new PRB20();
        int n = in.nextInt(); // repeat count and subset size
        int k = in.nextInt(); // 0 thru k-1
        int v = in.nextInt();

        p.n = n;
        p.k = k;
        p.v = v;
        p.modEquation();
        System.out.println(p.gCount);
        in.close();

    }

    public int gCount = 0;
    private int n, k, v;

    public void modEquation() {
        int[] array = new int[n];
        Arrays.fill(array, 0);

        modeqRecurse(array, 0);

    }

    private void modeqRecurse(int[] array, int pos) {

        if (pos == n) {
            if (modCheck(array, k, v)) {
                gCount++;
            }
            return;
        }

        for (int index = 0; index < k; index++) {
            array[pos] = index;
            modeqRecurse(array, pos + 1);
        }
    }

    private boolean modCheck(int[] list, int k, int v) {
        int product = 1;

        for (int val : list) {
            System.out.print(val + " ");
            product *= val;
        }
        System.out.println();
        return (product % k == v);
    }
}
