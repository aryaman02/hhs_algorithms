package net.aryaman.algo.misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SentenceParser {

    private static final List<Character> DELIMETERS = Arrays.asList(' ', '?', '.', ',', ':', ';');

    private String sentence;

    private int wordCount = 0;

    private List<String> words;

    private List<Integer> spacePositions;

    public SentenceParser(String sentence) {
        super();
        this.sentence = sentence;
        this.words = new ArrayList<>();
        this.spacePositions = new ArrayList<>();
    }

    /**
     * Parse the sentence, and store the words, and the spaces. The sentence
     * parsing logic goes here.
     */
    public void parse() {
        if (sentence == null || sentence.isEmpty()) {
            return;
        }
        char[] sentenceArray = sentence.toCharArray();
        int beginIndex = 0;
        int endIndex = 0;

        for (int index = 0; index < sentenceArray.length; index++) {

            char c = sentenceArray[index];
            if (DELIMETERS.contains(c)) {
                //if (sentenceArray[index] == ' ') {
                endIndex = index;

                if (endIndex > beginIndex) {
                    String word = sentence.substring(beginIndex, endIndex);
                    words.add(word);
                    wordCount++;
                }

                beginIndex = index + 1;
                spacePositions.add(index);
            }
        }

        String word = sentence.substring(beginIndex, sentenceArray.length);
        if (word.length() > 0) {
            words.add(word);
            wordCount++;
        }
    }

    public int getWordCount() {
        return wordCount;
    }

    public List<String> getWords() {
        return words;
    }

    public List<Integer> getSpacePositions() {
        return spacePositions;
    }

    public static void main(String[] args) {
        //SentenceParser sp2 = new SentenceParser(" My   name    is      Aryaman Das   ");
        SentenceParser sp = new SentenceParser("Name:  Aryaman Das.        ");

        sp.parse();
        int wordCount = sp.getWordCount();
        System.out.println("Number of words: " + wordCount);
        List<String> words = sp.getWords();
        for (String word2 : words) {
            System.out.print(word2 + " ");
        }
        System.out.println();

        List<Integer> spacePositions = sp.getSpacePositions();
        for (int pos : spacePositions) {
            System.out.print(pos + " ");
        }
        System.out.println();

    }
}
