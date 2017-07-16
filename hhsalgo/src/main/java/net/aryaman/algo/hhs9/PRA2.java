package net.aryaman.algo.hhs9;
import java.util.Scanner;

public class PRA2 {
    public static void main(String[] args) {
        PRA2 p = new PRA2();
        Scanner in = new Scanner(System.in);

        int normal = in.nextInt();
        int destination = in.nextInt();

        System.out.println(p.mountainBikeInjury(normal, destination));

        in.close();
    }
    public int mountainBikeInjury(int normal, int destination) {
        int injury = normal / 2;
        int steps = 2 * (destination / (normal + injury));

        if (destination % (normal + injury) != 0) {
            return steps + 1;
        } else {
            return steps;
        }
    }
}
