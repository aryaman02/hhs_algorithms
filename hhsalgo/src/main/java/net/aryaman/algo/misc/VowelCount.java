package net.aryaman.algo.misc;
import java.util.Arrays;
import java.util.List;

public class VowelCount {
    private static final List<Character> VOWELS = Arrays.asList('a','A', 'e', 'E', 'i','I','o','O','u','U');
    private String word;

    public VowelCount(String word) {
        super();
        this.word = word;
    }

    public int getVowelCount() {
        if (word == null || word.isEmpty()) {
            return 0;
        }
        char[] wordarray = word.toCharArray();
        int vowelCount = 0;

        for (char c : wordarray) {
            if (VOWELS.contains(c)) {
                vowelCount++;
            }
        }
        return vowelCount;
    }
    public static void main(String[] args) {
        VowelCount vc = new VowelCount("AryamanTejeswarSaradaSubhadarsini");
        int vowelCount = vc.getVowelCount();
        System.out.println("Number of vowels: " + vowelCount);
    }
}
