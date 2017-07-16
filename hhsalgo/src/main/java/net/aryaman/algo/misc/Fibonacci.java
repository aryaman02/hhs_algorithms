package net.aryaman.algo.misc;

public class Fibonacci {
    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        f.sequence(10);
    }

    public void sequence(int r) {
        int num1 = 0;
        int num2 = 1;

        for (int i = 0; i < r; i++) {
            int next = 0;
            next = num1 + num2;
            num1 = num2;
            num2 = next;

            System.out.println(next);
        }
    }

    public int sumOfvenFibbonaciNums(int end) {
        int num1 = 0;
        int num2 = 1;
        int sum = 0;

        for (int i = 0; i <= end; i++) {
            int num3 = 0;
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            System.out.println("The number is: " + num3);

            if (isNumberEven(num3)) {
                sum += num3;
            }
        }
        return sum;
    }

    public boolean isNumberEven(int num) {
        return !(num % 2 != 0);
    }

    public boolean isNumASquare(int number) {
        int sum = 0;
        int i = 1;

        while (sum < number) {
            sum += i;

            if (sum == number) {
                return true;

            } else if (sum > number) {
                return false;
            }
            i += 2;
        }
        return true;
    }

    public double largestNum(int sum, int length) {
        if (sum <= 0 || length <= 0) {
            return 0;
        }

        if (sum > length * 9) {
            return 0;
        }

        int[] numArray = new int[length];
        int digit = 9;

        for (int i = 0; i < numArray.length; i++) {
            if (sum >= digit) {
                numArray[i] = digit;
                sum -= digit;

            } else {
                digit = sum;
                numArray[i] = digit;
                sum -= digit;
            }
        }
        StringBuilder strNum = new StringBuilder();

        for (int j : numArray) {
            strNum.append(j);
        }
        return Double.parseDouble(strNum.toString());
    }

    public double smallestNum(int sum, int length) {
        if (sum <= 0 || length <= 0) {
            System.out.println("Incorrect input");
            return 0;
        }

        if (sum > length * 9) {
            System.out.println("Incorrect input");
            return 0;
        }
        int[] numArray = new int[length];
        int digit = 9;
        numArray[0] = 1;
        int sum2 = sum - 1;

        for (int i = numArray.length-1; i > 0; i--) {
            if (sum2 > digit) {
                numArray[i] = digit;
                sum2 -= digit;

            } else {
                digit = sum2;
                numArray[i] = digit;
                sum2 -= digit;
            }

        }
        if (sum2 > 0) {
            numArray[0] += sum2;
        }
        StringBuilder strNum = new StringBuilder();

        for (int j : numArray) {
            strNum.append(j);
        }
        return Double.parseDouble(strNum.toString());
    }
}
