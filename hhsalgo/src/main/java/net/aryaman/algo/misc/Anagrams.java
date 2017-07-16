package net.aryaman.algo.misc;

import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {
        Anagrams a = new Anagrams();
        boolean flag = a.isAnagram("amd", "cam");
        System.out.println(flag);
    }

    public boolean isAnagram(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }
        if (word1.equals(word2)) {
            return true;
        }
        if (word1 == null || word1.isEmpty()) {
            return false;

        } else if (word2 == null || word2.isEmpty()) {
            return false;
        }
        char[] word1array = word1.toCharArray();
        Arrays.sort(word1array);
        String newWord1 = new String(word1array);
        char[] newWord1array = newWord1.toCharArray();
        char[] word2array = word2.toCharArray();
        Arrays.sort(word2array);
        String newWord2 = new String(word1array);
        char[] newWord2array = newWord2.toCharArray();

        for (int i = 0; i < newWord1array.length; i++) {
            if (newWord1array[i] != newWord2array[i]) {
                return false;
            }
        }
        return true;
    }
}


