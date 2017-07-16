package net.aryaman.algo.person;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DictionaryDriver {
    private BufferedReader in = null;

    private Set<String> words = new HashSet<>();


    public static void main(String[] args) throws IOException {
        DictionaryDriver d = new DictionaryDriver();
        d.loadWordsfromFile();
        d.readWords();
    }

    public void readWords() throws IOException {
        TeleWordMapper iwd = new TeleWordMapper();
        in = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("Enter the number, Type quit2 to Quit");
            String userInput = in.readLine(); // 4567
            List<String> permutations = iwd.wordPermutations(userInput);
            if (permutations == null || permutations.isEmpty()) {
                continue;
            }

            checkWord(permutations);
            if (userInput.equalsIgnoreCase("quit2")) {
                System.out.println("Goodbye");
                break;
            }
        }
        in.close();
    }

    public void loadWordsfromFile() throws IOException {
        FileInputStream fis = new FileInputStream("/usr/share/dict/web2");
        BufferedReader reader = new BufferedReader(new InputStreamReader(fis));

        while (true) {
            String word = reader.readLine();
            if (word == null) {
                break;

            } else {
                words.add(word);
            }
        }
        reader.close();
    }

    private void checkWord(List<String> permutations) {
        for (String word : permutations) {
            if (words.contains(word)) {
                System.out.println("The word " + word + " is valid");
            }
        }
    }
}
