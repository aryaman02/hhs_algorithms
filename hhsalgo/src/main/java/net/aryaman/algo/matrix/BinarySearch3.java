package net.aryaman.algo.matrix;
import java.util.Arrays;

import net.aryaman.algo.misc.MyArrayUtils;

public class BinarySearch3 {
    public static void main(String[] args) {
        BinarySearch3 bs = new BinarySearch3();

        MyArrayUtils utils = new MyArrayUtils();
        int[] array = utils.generateArrayWithUniqueElements(20);
        //int[] array = {5, 8, 9, 6, 14, 11, 10, 2, 17};
        Arrays.sort(array);

        RotationArray ra = new RotationArray();
        ra.newRotateArrayRight(array, 5);

        System.out.println(Arrays.toString(array));

        System.out.println(bs.findMinInSortedAndRotatedArray(array));
    }

    public int findMinInSortedAndRotatedArray(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }

        int firstNumIndex = 0;
        int lastNumIndex = array.length-1;

        while (array[firstNumIndex] > array[lastNumIndex]) {
            int middle = (firstNumIndex + lastNumIndex) / 2;

            if (array[middle] > array[lastNumIndex]) {
                firstNumIndex = middle + 1;

            } else if (array[middle] < array[lastNumIndex]) {
                lastNumIndex = middle - 1;

            } else {
                return array[middle];
            }

        }
        return array[firstNumIndex];
    }
}
