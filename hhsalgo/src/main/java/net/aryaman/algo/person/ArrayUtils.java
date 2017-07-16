package net.aryaman.algo.person;

import java.util.Random;

public class ArrayUtils {
    public static int[] generateRandomArray(int size) {
        int[] array = new int[size];

        Random r = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = r.nextInt(50);
        }
        return array;
    }
}
