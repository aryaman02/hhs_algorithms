package net.aryaman.algo.person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LeetCode {
    public static void main(String[] args) {
        LeetCode lc = new LeetCode();

    }
    public boolean isNumberSqrt(int number) {
        for (int i = 1; i < number / 2; i++) {
            if (number / i == i) {
                return true;
            }
        }
        return false;
    }
    public int longestSubString(String chars) {
        if (chars == null || chars.length() == 0) {
            return 0;
        }
        char[] charsArray = chars.toCharArray();
        List<Integer> stringSizes = new ArrayList<>();
        Map<Character, Integer> letterCounts = new HashMap<>();
        int size = 0;

        for (int i = 0; i < charsArray.length; i++) {
            if (!letterCounts.containsKey(charsArray[i])) {
                letterCounts.put(charsArray[i], 1);
                size++;

            } else {
                stringSizes.add(size);
                size = 0;
                letterCounts.clear();
            }
        }
        Collections.sort(stringSizes);
        return stringSizes.get(stringSizes.size() - 1);
    }
    public void beginAndEndTarget(int[] array, int target) {
        if (binarySearch(array, target) == -1) {
            System.out.println("-1" + "-1");
        }
        int i = binarySearch(array, target);
        int j = binarySearch(array, target);

        while (array[i] == target) {
            i--;

            if (array[i] != target) {
                System.out.println("Begin index: " + (i+1));
                break;
            }
        }

        while (array[j] == target) {
            j++;

            if (array[j] != target) {
                System.out.println("End index: " + (j-1));
                break;
            }
        }
    }
    private int binarySearch(int[] array, int number) {
        Arrays.sort(array);
        int min = 0;
        int max = array.length - 1;

        if (number > array[max] || number < array[min]) {
            System.out.println(number + " is not a valid input");
            return -1;
        }

        while (true) {
            System.out.println("min: " + min + "  max: " + max);

            if (min > max) {
                return -1;
            }

            if (min == max && array[min] != number) {
                return -1;
            }

            int midpoint = (min + max) / 2;

            if (number > array[midpoint]) {
                min = midpoint + 1;

            } else if (number < array[midpoint]) {
                max = midpoint - 1;
            } else {
                return midpoint;
            }
        }
    }
    public boolean isHappyNumber(int number) {
        int result = 0;
        Set<Integer> sums = new HashSet<>();

        while (number > 1) {
            result = pullDigits(number);
            number = result;

            if (number == 1) {
                return true;
            }
            if (!sums.contains(result)) {
                sums.add(result);
            } else {
                return false;
            }
        }
        return false;
    }
    private int pullDigits(int number) {
        String num = String.valueOf(number);
        char[] numberarray = num.toCharArray();

        List<Integer> numberlist = new ArrayList<Integer>();

        for (char c : numberarray) {

            String s = String.valueOf(c);
            int num2 = Integer.valueOf(s);
            numberlist.add(num2);
        }

        int sum = 0;
        for (int i : numberlist) {
            sum += i*i;
        }
        return sum;
    }
}