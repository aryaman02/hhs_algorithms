package net.aryaman.algo.hhs9;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BinarySearch2 {
    public int matchingNumber(int[] array, int number) {
        int min = 0;
        int max = array.length - 1;

        if (number > array[max] || number < array[min]) {
            return -1;
        }

        while (true) {
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

    public int getClosestNumber(List<Integer> array, int number) {
        int minIndex = 0;
        int maxIndex = array.size() - 1;

        if (number >= array.get(maxIndex)) {
            return array.get(maxIndex);
        }

        if (number <= array.get(minIndex)) {
            return array.get(minIndex);
        }
        while (true) {
            if (minIndex > maxIndex) {
                throw new IllegalStateException();
            }

            if (minIndex == maxIndex) {
                return array.get(minIndex);
            }

            if (maxIndex == minIndex + 1) {
                if (number > array.get(minIndex) && number < array.get(maxIndex)) {
                    if (Math.abs(number - array.get(minIndex)) < Math.abs(number - array.get(maxIndex))) {
                        return array.get(minIndex);
                    } else {
                        return array.get(maxIndex);
                    }
                }
            }

            int midpointIndex = (minIndex + maxIndex) / 2;
            if (array.get(midpointIndex) == number) {
                return array.get(midpointIndex);
            }

            if (number > array.get(midpointIndex)) {
                minIndex = midpointIndex;

            } else if (number < array.get(midpointIndex)) {
                maxIndex = midpointIndex;
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        List<Integer> outputs = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            long n = in.nextLong();
            long val = (long) Math.pow(2, n);
            int output = (int) (val - 1) % 100000;
            outputs.add(output);
        }
        for (int o : outputs) {
            System.out.println(o);
        }
        in.close();
    }

}
