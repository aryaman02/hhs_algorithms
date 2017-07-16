package net.aryaman.algo.hhs9;
import java.util.Scanner;

public class PRA13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PRA13 p = new PRA13();
        System.out.print("Enter a word: ");
        String word = in.nextLine();

        p.repeatWord(word);

        in.close();

    }
    public long bricks(long w, long h, long m) {
        long i = w;

        while (m > 0) {
            if (i != 0) {
                if (m % i != 0) {
                    i--;

                } else if (m % i == 0 && (m / i) > h) {
                    i--;

                } else {
                    return m;
                }

            } else {
                m--;
                i = w;
            }
        }
        return 0;
    }
    public void repeatWord(String word) {
        for (int i = 0; i < word.length(); i++) {
            System.out.println(word);
        }
    }
}
