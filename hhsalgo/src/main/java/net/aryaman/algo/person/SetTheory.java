package net.aryaman.algo.person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SetTheory {
    public static void main(String[] args) {
        SetTheory st = new SetTheory();
        List<Integer> a1 = Arrays.asList(2, 7, 8, 3, 4);
        List<Integer> a2 = Arrays.asList(4, 2, 7);
        st.intersectionOld(a1, a2);
    }
    public void intersectionOld(List<Integer> a1, List<Integer> a2) {
        if (a1 == null || a1.isEmpty()) {
            return;
        } else if (a2 == null || a2.isEmpty()) {
            return;
        }
        Map<Integer, Integer> numCounts = new HashMap<>();

        List<Integer> newList = new ArrayList<Integer>(a1);
        newList.addAll(a2);

        for (int j : newList) {
            if (!numCounts.containsKey(j)) {
                numCounts.put(j, 1);

            } else {
                int count = numCounts.get(j);
                count++;
                numCounts.put(j, count);
            }
        }
        for (Entry<Integer, Integer> entry : numCounts.entrySet()) {
            if (entry.getValue() >= 2) {
                System.out.print(entry.getKey() + " ");
            }
        }
        System.out.println();
    }
    public void intersection(int[] a1, int[] a2) {
        if (a1 == null || a1.length == 0) {
            return;
        } else if (a2 == null || a2.length == 0) {
            return;
        }
        Arrays.sort(a1);
        Arrays.sort(a2);

        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));

        int i = 0;
        int j = 0;

        while (i < a1.length && j < a2.length) {
            if (a1[i] > a2[j]) {
                j++;

            } else if (a1[i] < a2[j]) {
                i++;

            } else {
                System.out.print(a1[i] + " ");
                i++;
                j++;
            }
        }
        System.out.println();
    }
}
