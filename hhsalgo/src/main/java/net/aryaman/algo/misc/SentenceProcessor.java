package net.aryaman.algo.misc;
import java.util.ArrayList;
import java.util.List;

public class SentenceProcessor {

    public static void main1(String[] args) {
        SentenceProcessor sp = new SentenceProcessor();
        int wordCount = sp.findNumberofWords("My name is Aryaman");
        System.out.println(wordCount);
        List<String> words = sp.parseWords("My name is Aryaman Das and My Dad name is Tejeswar");
        String longestWord = sp.findLongestWord(words);
        System.out.println("The longest word is " + longestWord + " and it is " + longestWord.length() + " letters long");

        List<String> words2 = sp.parseWords("The color blue is awesome!");
        String shortestWord = sp.findShortestWord(words2);
        System.out.println("The shortest word is " + shortestWord + " and it is " + shortestWord.length() + " letters long");
    }

    public static void main(String[] args) {
        SentenceProcessor sp = new SentenceProcessor();
        int wordCount = sp.findNumberofWords(" My name is Aryaman");
        System.out.println(wordCount);
    }

    public int findNumberofWords(String sentence) {
        if (sentence == null) {
            return 0;
        }

        if (sentence.isEmpty()) {
            return 0;
        }

        char[] sentenceArray = sentence.toCharArray();
        int spaceCount = 0;

        for (char c : sentenceArray) {
            if (c == ' ') {
                spaceCount++;

            }
        }
        int wordCount = spaceCount+1;
        return wordCount;
    }

    public List<String> parseWords(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            System.out.println("Can't print words");
            return null;
        }
        char[] sentenceArray = sentence.toCharArray();
        int beginIndex = 0;
        int endIndex = 0;
        List<String> words = new ArrayList<>();

        for (int index = 0; index < sentenceArray.length; index++) {
            if (sentenceArray[index] == ' ') {
                endIndex = index;
                String word = sentence.substring(beginIndex, endIndex);
                beginIndex = index+1;
                words.add(word);
            }
        }
        String word = sentence.substring(beginIndex, sentenceArray.length);
        words.add(word);

        for (String word2 : words) {
            System.out.println(word2);
        }
        return words;
    }

    public String findLongestWord(List<String> words) {
        if (words.isEmpty()) {
            System.out.println("Couldn't find any word that was the longest");
            return null;
        }
        int lengthOfWord = Integer.MIN_VALUE;
        String longestWord = null;

        for (String word : words) {

            if (word.length() > lengthOfWord) {
                lengthOfWord = word.length();
                longestWord = word;

            }
        }
        return longestWord;
    }
    public String findShortestWord(List<String> words2) {
        if (words2.isEmpty()) {
            System.out.println("Couldn't find any word that was the shortest");
            return null;
        }
        int lengthOfWord = Integer.MAX_VALUE;
        String shortestWord = null;

        for (String word : words2) {

            if (word.length() < lengthOfWord) {
                lengthOfWord = word.length();
                shortestWord = word;
            }
        }
        return shortestWord;
    }
}
