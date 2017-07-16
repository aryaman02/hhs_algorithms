package net.aryaman.algo.misc;

import java.util.HashMap;
import java.util.Map;

public class Palindrome {
    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        String word = null; //"malaalam";
        boolean flag = p.isPalindromeofAnagrams(word);
        System.out.println(flag);
    }

    public void isPalindrome(String word) {
        if (word == null || word.isEmpty()) {
            System.out.println("The word is a palindrome");
            return;
        }

        char[] wordarray = word.toCharArray();
        int lc = 0;
        int rc = wordarray.length - 1;

        while (true) {
            if (wordarray[lc] != wordarray[rc]) {
                System.out.println("The word is not a palindrome");
                break;
            } else if (lc > rc) {
                System.out.println("The word is a palindrome");
                break;

            } else if (lc == rc) {
                System.out.println("The word is a palindrome");
                break;

            }
            lc = lc + 1;
            rc = rc - 1;
        }
    }

    public boolean isPalindromeRecurse(char[] wordarray, int i, int j) {
        if (wordarray == null || wordarray.length <= 1) {
            return true;
        }

        if (i <= j) {
            if (wordarray[i] != wordarray[j]) {
                return false;
            }
            return isPalindromeRecurse(wordarray, i + 1, j - 1);
        } else {
            return true;
        }
    }

    public boolean isPalindromeofAnagrams(String word) {
        if (word == null || word.isEmpty()) {
            return true;
        }
        Map<Character, Integer> charcounts = new HashMap<>();
        char[] wordarray = word.toCharArray();

        for (char c : wordarray) {
            if (!charcounts.containsKey(c)) {
                charcounts.put(c, 1);
            } else {
                int newCount = charcounts.get(c);
                newCount++;
                charcounts.put(c, newCount);
            }
        }

        int oddcount = 0;
        for (int val : charcounts.values()) {
            if (val % 2 == 1) {
                oddcount++;

                if (oddcount > 1) {
                    return false;
                } else {
                    // cant do anything
                }
            }
        }
        return true;
    }
}
