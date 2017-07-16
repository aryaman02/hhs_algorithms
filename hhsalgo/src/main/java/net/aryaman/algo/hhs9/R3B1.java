package net.aryaman.algo.hhs9;
import java.text.DecimalFormat;
import java.util.Scanner;

public class R3B1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x1 = in.nextDouble();
        double y1 = in.nextDouble();
        double x2 = in.nextDouble();
        double y2 = in.nextDouble();

        if ((x2 - x1) == 0.0) {
            System.out.println("na");
        }
        if ((y2 - y1) == 0.0) {
            System.out.println(0.000);

        } else {
            double slope = (y2 - y1) / (x2 - x1);
            DecimalFormat df = new DecimalFormat("#.000");
            System.out.println(df.format(slope));
        }
        in.close();
    }
}
