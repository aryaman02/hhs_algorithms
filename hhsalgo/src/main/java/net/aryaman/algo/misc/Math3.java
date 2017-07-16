package net.aryaman.algo.misc;

public class Math3 {

    public void createoddnumbers(int r) {
        int number = 1;
        int count = 0;

        while (true) {
            number = number + 2;
            count = count + 1;

            if (number == r) {
                break;
            } else if (count == r / 2) {
                break;
            }
            System.out.println(number);

        }
        System.out.println("# of odd numbers generated: " + count);
    }

    public void divisionfunction(int integer, int divisor) {
        int number = integer;
        int dividend = 0;

        while (true) {
            number = number - divisor;
            dividend = dividend + 1;

            if (number <= divisor) {
                System.out.println("The answer is: " + dividend);
                return;

            }
        }
    }

    public void createtriangle(int n) {

        for (int j = 0; j < n; j++) {
            for (int i = 0; i <= j; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void createtriangle2(int s) {

        for (int i = 0; i < s; i++) {
            for (int j = s; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void generateStars() {

        for (int j = 0; j <= 9; j++) {
            for (int i = 0; i <= j; i++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }

    public void multiplication(int m, int n) {
        int result = 0;

        for (int i = 0; i < n; i++) {
            result = result + m;

        }
        System.out.println("The answer is: " + result);

    }

    public void isEven(int number) {

        if (number % 2 == 0) {
            System.out.println(" even");

        } else {
            System.out.println("odd");
        }
        System.out.println("The number is: " + number);
    }

    public boolean isDivisibleByThree(int number) {
        int tempNumber = number;
        int remainder = 0;
        int sum = 0;

        while (true) {

            if (tempNumber == 0) {
                break;
            }

            remainder = tempNumber % 10;
            tempNumber = tempNumber / 10;
            sum = sum + remainder;
        }

        if (sum % 3 == 0) {
            System.out.println(number + " is divisible by three");
            return true;
        } else {
            System.out.println(number + " is not divisble by three");
            return false;
        }
    }

    /**
     * @param sum
     * @param count
     * @return
     */
  
    }
