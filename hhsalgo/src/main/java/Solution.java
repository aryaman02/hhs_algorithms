import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] h = new int[26];
        for(int h_i=0; h_i < 26; h_i++){
            h[h_i] = in.nextInt();
        }
        String word = in.next();
        Map<Character, Integer> letters = new HashMap<>();
        letters.put('a', 0);
        letters.put('b', 1);
        letters.put('c', 2);
        letters.put('d', 3);
        letters.put('e', 4);
        letters.put('f', 5);
        letters.put('g', 6);
        letters.put('h', 7);
        letters.put('i', 8);
        letters.put('j', 9);
        letters.put('k', 10);
        letters.put('l', 11);
        letters.put('m', 12);
        letters.put('n', 13);
        letters.put('o', 14);
        letters.put('p', 15);
        letters.put('q', 16);
        letters.put('r', 17);
        letters.put('s', 18);
        letters.put('t', 19);
        letters.put('u', 20);
        letters.put('v', 21);
        letters.put('w', 22);
        letters.put('x', 23);
        letters.put('y', 24);
        letters.put('z', 25);

        int largestVal = Integer.MIN_VALUE;

        for (int i = 0; i < word.length(); i++) {
            if (letters.containsKey(word.charAt(i))) {
                int val = letters.get(word.charAt(i));
                int elem = h[val];
                if (largestVal < elem) {
                    largestVal = elem;
                }
            }
        }
        System.out.println(word.length() * largestVal);
    }
}
