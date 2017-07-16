package net.aryaman.algo.string;

import java.util.Scanner;

public class StringTester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringToolBox stb = new StringToolBox();
        System.out.println("Here are your choices: ");
        System.out.println("1: End with one Star");
        System.out.println("2: End with two Stars");
        System.out.println("3: Print Last4 String");
        System.out.println("4: Print Last5 String");
        System.out.println("5: scroll");
        System.out.println("6: convertName");
        System.out.println("7: removeDashes");
        System.out.println("8: caesarCipher");
        System.out.println("9: containsSameChar");
        System.out.println("10: removeComments");
        System.out.println("11: negativeBits");
        System.out.println("12: convertDate");
        System.out.println("13: nameEcho");
        System.out.println("14: isPalindrome");
        System.out.println("15: isValidPassword");
        System.out.println("16: Exit");

        System.out.print("Enter a desired choice # to run: ");
        String option = in.nextLine();
        int choice = Integer.parseInt(option);

        while (choice != 16) {
            if (choice == 1) {
                System.out.println("Enter a string: ");
                String str = in.nextLine();
                System.out.println(stb.endsWithStar(str));

            } else if (choice == 2) {
                System.out.println("Enter a string: ");
                String str = in.nextLine();
                System.out.println(stb.endsWithTwoStars(str));

            } else if (choice == 3) {
                System.out.println("Enter a credit card number: ");
                String str = in.nextLine();
                System.out.println(stb.setLast4String(str));

            } else if (choice == 4) {
                System.out.println("Enter a credit card number: ");
                String str = in.nextLine();
                System.out.println(stb.setLast5String(str));

            } else if (choice == 5) {
                System.out.println("Enter a string: ");
                String str = in.nextLine();
                System.out.println(stb.scroll(str));

            } else if (choice == 6) {
                System.out.println("Enter a name: ");
                String str = in.nextLine();
                System.out.println(stb.convertName(str));

            } else if (choice == 7) {
                System.out.println("Enter a social security number: ");
                String str = in.nextLine();
                System.out.println(stb.removeDashes(str));

            } else if (choice == 8) {
                System.out.println("Enter a string: ");
                String str = in.nextLine();
                String n = in.nextLine();
                System.out.println(stb.caesar(str, Integer.parseInt(n)));

            } else if (choice == 9) {
                System.out.println("Enter a string: ");
                String str = in.nextLine();
                System.out.println(stb.containsSameChar(str));

            } else if (choice == 10) {
                System.out.println("Enter a string: ");
                String str = in.nextLine();
                System.out.println(stb.removeComments(str));

            } else if (choice == 11) {
                System.out.println("Enter a binary string: ");
                String str = in.nextLine();
                System.out.println(stb.negativeBits(str));

            } else if (choice == 12) {
                System.out.println("Enter a date: ");
                String str = in.nextLine();
                System.out.println(stb.dateStr(str));

            } else if (choice == 13) {
                System.out.println("Enter your first and last name: ");
                String str = in.nextLine();
                System.out.println(stb.nameEcho(str));

            } else if (choice == 14) {
                System.out.println("Enter a string: ");
                String str = in.nextLine();
                System.out.println(stb.isPalindrome(str));

            } else if (choice == 15) {
                System.out.println("Enter a password: ");
                String str = in.nextLine();
                System.out.println(stb.isValidPassword(str));

            } else {
                System.out.println("Invalid Choice #");
            }
            System.out.print("Enter a desired choice # to run: ");
            option = in.nextLine();
            choice = Integer.parseInt(option);
        }
        in.close();
    }
}

