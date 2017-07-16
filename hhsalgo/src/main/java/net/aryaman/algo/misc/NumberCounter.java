/*
 * ******************************************************
 * Copyright VMware, Inc. 2014.   All Rights Reserved.
 * ******************************************************
 */
package net.aryaman.algo.misc;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class NumberCounter {
    public static void main(String[] args) {
        NumberCounter nc = new NumberCounter();
        int[] array = {2, 4, 8, 2, 4, 7, 9, 9};
        nc.map(array);

    }
    public void map(int[] array) {
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            int number = array[i];

            if (!countMap.containsKey(number)) {
                countMap.put(number, 1);
            }
            else {
                int repeatCount = countMap.get(number);
                repeatCount++;
                countMap.put(number, repeatCount);

            }
        }

        for (Entry<Integer, Integer> entry: countMap.entrySet()) {
            System.out.println("key: " + entry.getKey() + "  value: " + entry.getValue());
        }
    }

}
