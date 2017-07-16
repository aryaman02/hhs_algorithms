package net.aryaman.algo.hackerrank;
import java.util.Scanner;

public class Leaderboard {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        int pos = 0;
        int count = 0;
        if (c.length == 2) {
            if (c[0] == 0 && c[1] == 0) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        } else {
            while (true) {
                if (pos+2 < c.length) {
                    if (c[pos+2] == 0) {
                        pos += 2;
                        count++;
                    } else {
                        pos++;
                        count++;
                    }
                    if (pos+2 == c.length && c[c.length-1] == 0) {
                        pos++;
                        count++;
                    }
                } else {
                    break;
                }

            }
            System.out.println(count);
        }
        in.close();
    }
    public long convertGifts(String str1, String str2) {
        String[] str1Array = str1.split(" ");
        String[] str2Array = str2.split(" ");
        long b = Long.parseLong(str1Array[0]);
        long w = Long.parseLong(str1Array[1]);
        long x = Long.parseLong(str2Array[0]);
        long y = Long.parseLong(str2Array[1]);
        long z = Long.parseLong(str2Array[2]);

        if (x <= z && y <= z) {
            return x*b + y*w;
        } else {
            if (x >= y) {
                long conversion = y+z;
                return conversion*b + y*w;
            } else {
                long conversion2 = x+z;
                return conversion2*w + x*b;
            }
        }
    }
}