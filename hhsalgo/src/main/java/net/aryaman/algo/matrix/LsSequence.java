package net.aryaman.algo.matrix;

import java.util.ArrayList;
import java.util.List;

public class LsSequence {
    public static void main(String[] args) {
        LsSequence ls = new LsSequence();
        String number = "1";

        for (int i = 0; i < 10; i++) {
            System.out.println(number);
            number = ls.say2(number);
        }

    }
    public String say2(String prevSequence) {
        if (prevSequence == null || prevSequence.isEmpty()) {
            return null;
        }
        char[] sequenceArray = prevSequence.toCharArray();
        List<Character> currentSequence = new ArrayList<>();

        int count = 1;
        int i = 1;

        while (i < sequenceArray.length) {

            if (sequenceArray[i] == sequenceArray[i - 1]) {
                count++;

            } else {
                char count2 = Character.forDigit(count, 10);
                currentSequence.add(count2);
                currentSequence.add(sequenceArray[i-1]);
                count = 1;
            }
            i++;
        }
        char count2 = Character.forDigit(count, 10);
        currentSequence.add(count2);
        currentSequence.add(sequenceArray[i-1]);
        char[] currSequenceArray = new char[currentSequence.size()];

        int j = 0;
        for (char c : currentSequence) {
            currSequenceArray[j] = c;
            j++;

        }
        return new String(currSequenceArray);
    }

}