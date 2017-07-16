package net.aryaman.algo.hackerrank;
import java.util.Scanner;

public class Clouds {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Clouds c = new Clouds();
        String str = in.nextLine();
        String[] strArray = str.split(" ");
        int n = Integer.parseInt(strArray[0]);
        int k = Integer.parseInt(strArray[1]);
        int array[] = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        System.out.println(c.clouds(array, k));
        in.close();
    }

    public int clouds(int[] array, int k) {
        int energy = 100;

        for (int i = 0; i < array.length; i += k) {
            if (array[i] == 1) {
                energy -= 3;
            } else {
                energy -= 1;
            }
        }
        return energy;
    }
}
