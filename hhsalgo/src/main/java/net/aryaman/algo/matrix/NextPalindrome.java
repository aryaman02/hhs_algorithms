package net.aryaman.algo.matrix;


public class NextPalindrome {
    public static void main(String[] args) {
        NextPalindrome np = new NextPalindrome();
        System.out.println(isArmstrongNum(153));
    }

    public int nextPalindrome(int n) {
        if (n <= 0) {
            return -1;
        }
        for (int number = n+1; ; number++) {
            if (isPalindrome(number) == true) {
                return number;
            }
        }
    }
    public int prevPalindrome(int n) {
        if (n <= 0) {
            return -1;
        }
        for (int number = n-1; ; number--) {
            if (isPalindrome(number) == true) {
                return number;
            }
        }
    }

    public boolean isPalindrome(int number) {
        if (number == 0) {
            return false;
        }
        String numString = String.valueOf(number);

        char[] numStringArray = numString.toCharArray();
        int i = 0;
        int j = numStringArray.length - 1;

        while (true) {
            if (numStringArray[i] != numStringArray[j]) {
                return false;

            } else if (i >= j) {
                return true;

            }
            i++;
            j--;
        }
    }

    public static boolean isArmstrongNum(int number) {
        String num = Integer.toString(number);
        int[] numArray = new int[num.length()];

        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = num.charAt(i) - '0';
        }
        int sum = 0;

        for (int i = 0; i < numArray.length; i++) {
            sum += Math.pow(numArray[i], 3);
        }
        if (sum == number) {
            return true;
        }
        return false;
    }
}