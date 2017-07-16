package net.aryaman.algo.misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonElements {
    public static void main(String[] args) {
        CommonElements ce = new CommonElements();
        MyArrayUtils ma = new MyArrayUtils();
        int[] a1 = ma.generateArrayWithUniqueElements(20);
        Arrays.sort(a1);
        System.out.println(Arrays.toString(a1));
        int[] a2 = ma.generateArrayWithUniqueElements(20);
        Arrays.sort(a2);
        System.out.println(Arrays.toString(a2));
        List<Integer> commonElements = ce.commonElements(a1, a2);

        for (int j : commonElements) {
            System.out.println(j);
        }
    }

    public boolean binarySearch(int[] array, int number, int min, int max) {
        if (number == array[min] || number == array[max]) {
            return true;
        } else if (number < array[min] || number > array[max]) {
            return false;
        }
        int median = (min + max) / 2;

        if (number > array[median]) {
            boolean found = binarySearch(array, number, median + 1, max);
            return found;

        } else if (number < array[median]) {
            boolean found = binarySearch(array, number, min, median - 1);
            return found;
        } else {
            // number == array[median]
            return true;
        }
    }
    public boolean find(int[] array, int number) {
        return binarySearch(array, number, 0, array.length-1);
    }

    public List<Integer> commonElements(int[] a1, int[] a2) {
        List<Integer> commonElements = new ArrayList<>();

        for (int number : a1) {
            if (find(a2, number) == true) {
                commonElements.add(number);
            }
        }
        return commonElements;
    }
}
