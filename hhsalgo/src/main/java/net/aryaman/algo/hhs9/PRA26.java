package net.aryaman.algo.hhs9;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;


public class PRA26 {
    public static void main(String[] args) {
        PRA26 p = new PRA26();
        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();
        List<Long> outputs = new ArrayList<>();

        for (int i = 0; i < cases; i++) {
            int n = in.nextInt();
            int highestIndex = (int) (Math.log(n) / Math.log(2));
            Stack<Integer> combinations = new Stack<>();
            outputs.add(p.varunsCoins(highestIndex, n, combinations));
        }
        for (long j : outputs) {
            System.out.println(j);
        }
        in.close();
    }

    public static void main2(String[] args) {
        PRA26 p = new PRA26();
        int n = 2;
        // long result = p.varunsCoins(1, n);
        //System.out.println(result);
    }
    public long varunsCoins(int index, long sumLeft, Stack<Integer> combinations) {
        if (sumLeft == 0) {
            // combinations.add(sb.toString());
            //str = "";
            for (int i : combinations) {
                System.out.print(i + " ");
            }
            System.out.println();
            return 1;
        }
        if (index < 0) {
            return 0;
        }

        if (sumLeft < 0) {
            return 0;
        }

        int currentcoin = (int) Math.pow(2, index);
        /*
         * Do not use the current coin (2 ^ index)
         * 2nd case is use the current coin (2 ^ index)
         * 3rd case is use 2 of your current coins (2 ^ index)
         */
        /*
         * Do not use current coin
         */
        long a = varunsCoins(index-1, sumLeft, combinations);

        long b = 0;
        long c = 0;

        /*
         * Use the coin once if possible
         */
        if (sumLeft >= currentcoin) {
            combinations.push(currentcoin);
            b = varunsCoins(index-1, sumLeft - currentcoin, combinations);
            combinations.pop();
        }

        /*
         * Use coin twice if possible
         */
        if (sumLeft >= currentcoin*2) {
            combinations.push(currentcoin);
            combinations.push(currentcoin);
            c = varunsCoins(index-1, sumLeft - currentcoin*2, combinations);
            combinations.pop();
            combinations.pop();
        }
        return a+b+c;
    }
}


