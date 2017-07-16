package net.aryaman.algo.misc;

import java.util.HashMap;
import java.util.Map;

public class Recursion {
    private Map<Integer, Integer> fibMap = new HashMap<>();

    public static void main(String[] args) {
        Recursion r = new Recursion();
        System.out.println(r.fibbonaciOld(7));
        System.out.println(r.fibbonaci(7));

    }

    public int sum(int n) {

        if (n <= 0) {
            return 0;
        } else {
            int answer = n + sum(n - 1);
            return answer;
        }
    }

    public int fibbonaciOld(int n) {
        System.out.print("* ");
        if (n <= 0) {
            return 0;

        } else if (n == 1) {
            return 1;

        } else {
            int val1 = fibbonaciOld(n-1);
            int val2 = fibbonaciOld(n-2);

            return val1 + val2;
        }
    }

    public int fibbonaci(int n) {
        System.out.print("# ");
        if (n <= 0) {
            return 0;

        } else if (n == 1) {
            return 1;

        } else {
            Integer val1 = fibMap.get(n-1);
            if (val1 == null) {
                val1 = fibbonaci(n - 1);
                fibMap.put(n - 1, val1);
            } else {
                // I have got the value. Now what?
                // What am I doing? Nothing!!

                //return fibbonaci(n - 1);
            }

            Integer val2 = fibMap.get(n-2);
            if (val2 == null) {
                val2 = fibbonaci(n-2);
                fibMap.put(n - 2, val2);
            } else {
                //return fibbonaci(n - 2);
            }
            return val1 + val2;
        }
    }
}
