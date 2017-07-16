package net.aryaman.algo.hhs9;
import java.util.Scanner;


public class PRA1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PRA1 p = new PRA1();
        for (int i = 0; i <= 5; i++) {
            String numbers = in.nextLine();
            System.out.println(p.rowOfBricks(numbers));
        }
        in.close();
    }
    public boolean rowOfBricksOld(String numbers) {
        if (numbers == null || numbers.isEmpty()) {
            return false;
        }
        String[] numArray = numbers.split(" ");

        int numOfSmall = Integer.valueOf(numArray[0]);
        int numOfBig = Integer.valueOf(numArray[1]);
        int length = Integer.valueOf(numArray[2]);

        for (int i = 0; i <= numOfSmall; i++) {
            for (int j = 0; j <= numOfBig; j++) {
                int operation = i*1 + j*5;

                if (operation == length) {
                    return true;
                }
            }
        }
        return false;
    }
    public boolean rowOfBricks(String numbers) {
        if (numbers == null || numbers.isEmpty()) {
            return false;
        }
        String[] numArray = numbers.split(" ");

        int numOfSmall = Integer.valueOf(numArray[0]);
        int numOfBig = Integer.valueOf(numArray[1]);
        int length = Integer.valueOf(numArray[2]);
        int need = length / 5;
        int result = 0;

        if (numOfBig > need) {
            result = length - (need * 5);

            if (numOfSmall >= result) {
                return true;
            }
            return false;

        } else {
            result = length - (numOfBig * 5);

            if (numOfSmall >= result) {
                return true;
            }
            return false;

        }
    }
}
