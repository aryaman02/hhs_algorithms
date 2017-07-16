package net.aryaman.algo.misc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class NumberStore {
    private List<Integer> numbers = new ArrayList<>();
    private final Map<Integer, Integer> countMap = new HashMap<>();

    public void addNumbers(int[] array) {
        if (array.length == 0) {
            System.out.println("Oops, try again!");
            return;
        }

        for (int i = 0; i < array.length; i++) {
            numbers.add(array[i]);
        }
    }

    public void compute() {
        for (int number : numbers) {

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

    public int getMode() {
        List<Integer> repeatCounts = new ArrayList<>();

        repeatCounts.addAll(countMap.values());

        int largenum = 0;

        for (int j : repeatCounts) {
            if (j > largenum) {
                largenum = j;
            }
        }

        for (Entry<Integer, Integer> entry : countMap.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();

            if (value == largenum) {
                return key;
            }
        }
        return 0;
    }

    public int getLeastMode() {
        List<Integer> repeatCounts = new ArrayList<>();
        repeatCounts.addAll(countMap.values());

        int smallnum = Integer.MAX_VALUE;

        for (int j : repeatCounts) {
            if (j < smallnum) {
                smallnum = j;
            }
        }

        for (Entry<Integer, Integer> entry : countMap.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();

            if (value == smallnum) {
                return key;
            }
        }
        return 0;
    }

    public int getFrequency(int number) {

        if (!countMap.containsKey(number)) {
            return 0;
        } else {
            return countMap.get(number);
        }
    }

    public static void main(String[] args) {
        int[] array = {3, 3, 8, 7, 1, 5, 5, 3, 8, 0};
        NumberStore ns = new NumberStore();
        ns.addNumbers(array);
        ns.compute();
        //int key = ns.getMode();
        //System.out.println(key);
        int key = ns.getLeastMode();
        System.out.println(key);
        int num = ns.getFrequency(5);
        System.out.println(num);
    }
}
