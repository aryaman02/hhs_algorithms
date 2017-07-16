package net.aryaman.algo.matrix;


public class ReverseSentence {
    public static void main(String[] args) {
        ReverseSentence rs = new ReverseSentence();
        String newSentence = rs.sentenceWithNoSpaces("");
        System.out.println(newSentence);
    }
    public String reverseSentence(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return null;
        }
        char[] sentenceArray = sentence.toCharArray();
        int i = 0;
        int j = sentenceArray.length - 1;
        reverse(sentenceArray, i, j);

        int beginIndex = 0;
        int endIndex = 0;

        for (int index = 0; index < sentenceArray.length; index++) {
            if (sentenceArray[index] == ' ') {
                System.out.println("I found a word");

                endIndex = index - 1;
                reverse(sentenceArray, beginIndex, endIndex);

                beginIndex = index + 1;
            }

        }

        if (beginIndex < sentenceArray.length-1) {
            reverse(sentenceArray, beginIndex, sentenceArray.length-1);
        }

        return String.valueOf(sentenceArray);
    }

    public void reverse(char[] array, int beginIndex, int endIndex) {
        while (beginIndex <= endIndex) {
            char temp = array[beginIndex];
            array[beginIndex] = array[endIndex];
            array[endIndex] = temp;

            beginIndex++;
            endIndex--;
        }
    }
    public String sentenceWithNoSpaces(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return null;
        }
        char[] sentenceArray = sentence.toCharArray();
        int spaceCount = 0;

        for (char c : sentenceArray) {

            if (c == ' ') {
                spaceCount++;

            }
        }
        char[] cloneArray = new char[sentenceArray.length - spaceCount];
        int j = 0;
        for (int i = 0; i < sentenceArray.length; i++) {
            char c = sentenceArray[i];

            if (c != ' ') {
                cloneArray[j] = c;
                j++;
            }
            if (j == cloneArray.length) {
                break;
            }
        }
        return String.valueOf(cloneArray);
    }
}