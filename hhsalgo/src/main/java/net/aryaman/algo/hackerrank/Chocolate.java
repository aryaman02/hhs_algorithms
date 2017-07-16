package net.aryaman.algo.hackerrank;
import java.util.Scanner;

public class Chocolate {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in.nextLine();
        String path = in.nextLine();
        int elevation = 0;
        int valley = 0;

        for (int i = 0; i < path.length(); i++) {
            if (path.charAt(i) == 'D') {
                elevation--;
            } else if (path.charAt(i) == 'U') {
                elevation++;
            }
            if (elevation == 0 && path.charAt(i-1) == 'U') {
                valley++;
            }
        }
        System.out.println(valley-1);
        in.close();
    }
}