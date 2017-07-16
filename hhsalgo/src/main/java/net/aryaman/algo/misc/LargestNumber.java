package net.aryaman.algo.misc;

public class LargestNumber {
    public static void main(String[] args) {
        LargestNumber ln = new LargestNumber();
        //int[] array = {2, 5, 9, 13, 15, 16, 11, 7, 4, 6, 8, 3, 1, 5, 7, 12, -3, -5, -1, 0};
        //int[] array = {5, 7, 9};

        int[] array = {5, 4, 3, 7, 10};
        //int max = ln.findlargestNum(array);
        //System.out.println(max);
        ln.findMaxandMinVals(array);
    }

    public int findlargestNum(int[] array) {
        if (array.length == 0) {
            return 0;
        }

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {

            if (array[i] > max) {
                max = array[i];
            } else {
                return max;
            }
        }
        return 0;
    }

    public void findMaxandMinVals(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }

        System.out.println(array[0]);

        if (array.length == 1) {
            return;
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        boolean isIncreasing = true;

        if (array[0] < array[1]) {
            isIncreasing = true;
        } else {
            isIncreasing = false;
        }

        for (int i = 0; i < array.length; i++) {

            if (isIncreasing) {
                if (array[i] > max) {
                    max = array[i];
                } else {
                    System.out.println(max);
                    isIncreasing = false;
                    max = Integer.MIN_VALUE;
                }
            } else {
                if (array[i] < min) {
                    min = array[i];
                } else {
                    System.out.println(min);
                    isIncreasing = true;
                    min = Integer.MAX_VALUE;
                }
            }
        }

        System.out.println(array[array.length-1]);
    }
}
