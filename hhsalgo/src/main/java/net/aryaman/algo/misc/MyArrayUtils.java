package net.aryaman.algo.misc;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import org.apache.commons.lang3.ArrayUtils;

public class MyArrayUtils {
    /**
     * Generate an array of count random numbers
     *
     * @param count
     * @return array
     */
    public int[] generateArray(int count) {

        int[] array = new int[count];

        Random r = new Random();
        for (int i = 0; i < count; i++) {
            int randnum = r.nextInt(100);
            array[i] = randnum;
        }

        return array;
    }

    public int[] generateArrayWithUniqueElements(int count) {
        Set<Integer> uniqueElems = new HashSet<>();
        Random r = new Random();

        while (uniqueElems.size() < count) {
            int randnum = r.nextInt(100);
            uniqueElems.add(randnum);
        }
        Integer[] array = uniqueElems.toArray(new Integer[count]);
        return ArrayUtils.toPrimitive(array);

    }

    /**
     * This function should do the following: swap the values at indexa and
     * indexb
     * 
     * @param numbers
     * @param indexa
     * @param indexb
     */
    public void swap(int[] numbers, int indexa, int indexb) {

        if (indexa > numbers.length - 1) {
            System.out.println("Cannot pass this number: " + indexa);
            return;
        }
        if (indexb > numbers.length - 1) {
            System.out.println("Cannot pass this number: " + indexb);
            return;
        }

        int temp = numbers[indexa];
        numbers[indexa] = numbers[indexb];
        numbers[indexb] = temp;
    }
}
