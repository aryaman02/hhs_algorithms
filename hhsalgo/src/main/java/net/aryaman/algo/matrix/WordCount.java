package net.aryaman.algo.matrix;

public class WordCount {
    static int count = 0;
    public static void main(String[] args) {
        WordCount wc = new WordCount();
        String s = "fast";
        char[] stringArray = s.toCharArray();
        wc.permutations(stringArray, 0);
        //int permutationCount = wc.findNumberofPerms("Aryaman");
        //System.out.println("Number of permutations: " + permutationCount);
        System.out.println(count);

    }

    public int wordCount(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return 0;
        }
        int spaceCount = 0;

        for (int i = 0; i < sentence.length(); i++) {

            if (sentence.charAt(i) == ' ') {
                System.out.println("I found a word!");
                spaceCount++;
            }

        }
        return spaceCount + 1;
    }

    private static void swap(char[] array, int posX, int posY) {
        char temp = array[posX];
        array[posX] = array[posY];
        array[posY] = temp;
    }

    public void permutations(char[] stringArray, int pos) {

        if (pos == stringArray.length) {
            String word = String.valueOf(stringArray);
            System.out.println(word);
            count++;
            return;

        } else {
            for (int i = pos; i < stringArray.length; i++) {
                swap(stringArray, i, pos);
                permutations(stringArray, pos + 1);
                swap(stringArray, i, pos);
            }
        }

    }

    public int findNumberofPerms(String word) {
        if (word == null || word.isEmpty()) {
            return 0;
        }
        int n = word.length();
        int permutationCount = 1;

        for (int i = n; i >= 1; i--) {
            permutationCount = permutationCount * i;
        }
        return permutationCount;
    }
}
