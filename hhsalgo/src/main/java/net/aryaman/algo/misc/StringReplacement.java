package net.aryaman.algo.misc;

public class StringReplacement {
    public static void main(String[] args) {
        StringReplacement sr = new StringReplacement();
        sr.stringReplacer("Aryaman Kapali Das", "om");

    }

    public void stringReplacer(String sentence, String replacer) {
        if (sentence.isEmpty() || sentence == null) {
            return;
        }
        char[] wordarray = sentence.toCharArray();
        int spaceCount = 0;
        int wordcount = wordarray.length;


        for (char c : wordarray) {
            if (c == ' ') {
                spaceCount++;
            }
        }

        System.out.println("Spacecount: " + spaceCount);
        char[] replacerArray = replacer.toCharArray();

        System.out.println("Wordcount: " + wordcount);

        int newwordarraylen = wordcount + (replacerArray.length - 1) * spaceCount;
        System.out.println("newwordarraylen: " + newwordarraylen);

        char[] newWordarray = new char[newwordarraylen];

        /*
         * Iterate wordArray.
         * Check the char. If it is not ' ', copy it to newWordArray
         * Else, copy replacer to wordArray
         */
        int index = 0;

        for (char s : wordarray) {

            if (s != ' ') {
                newWordarray[index] = s;
                index++;
            } else {
                System.arraycopy(replacerArray, 0, newWordarray, index, replacerArray.length);
                index = index + replacerArray.length;
            }
        }
        String newWord = new String(newWordarray);
        System.out.println(newWord);


    }
}

