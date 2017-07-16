package net.aryaman.algo.person;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TeleWordMapper {
    private Map<Character, List<Character>> teleLetters;

    public static void main(String[] args) {
        TeleWordMapper iwd = new TeleWordMapper();
        List<String> permutations = iwd.wordPermutations("3245");

        if (permutations != null) {

            for (String s : permutations) {
                System.out.println(s);
            }
        }
    }

    private char[] splitAndRemoveFirst(char[] array) {
        char[] copy = new char[array.length-1];
        System.arraycopy(array, 1, copy, 0, array.length-1);
        return copy;
    }

    private void createMap() {
        teleLetters = new HashMap<>();
        teleLetters.put('2', Arrays.asList('a', 'b', 'c'));
        teleLetters.put('3', Arrays.asList('d', 'e', 'f'));
        teleLetters.put('4', Arrays.asList('g', 'h', 'i'));
        teleLetters.put('5', Arrays.asList('j','k', 'l'));
        teleLetters.put('6', Arrays.asList('m', 'n', 'o'));
        teleLetters.put('7', Arrays.asList('p', 'q', 'r', 's'));
        teleLetters.put('8', Arrays.asList('t', 'u', 'v'));
        teleLetters.put('9', Arrays.asList('w', 'x', 'y', 'z'));
    }

    public List<String> wordPermutations(String word) {
        if (word.length() != 4) {
            System.out.println("Invalid input: length is not 4");
            return null;
        }
        List<String> permutations = new ArrayList<>();
        char[] numArray = word.toCharArray();
        for (char c : numArray) {
            if (c == '1' || c == '0') {
                System.out.println("Invalid input: cannot contain 0 or 1");
                return null;
            }
        }
        createMap();
        char[] output = new char[4];
        createPermutations(numArray, output, 0, permutations);

        return permutations;
    }

    public void createPermutations(char[] array, char[] output, int pos, List<String> permutations) {
        if (array.length == 0) {
            /*
             * Termination point for recursion. Also, grab the output at this point.
             */
            permutations.add(new String(output));
            return;

        } else {
            char teleDigit = array[0];

            for (char c : teleLetters.get(teleDigit)) {
                output[pos] = c;

                char[] inputForRecursion = splitAndRemoveFirst(array);
                createPermutations(inputForRecursion, output, pos+1, permutations);
            }
        }
    }
}
