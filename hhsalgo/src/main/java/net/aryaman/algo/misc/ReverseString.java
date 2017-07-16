package net.aryaman.algo.misc;

public class ReverseString {

    public static void main(String[] args) {
        ReverseString rs = new ReverseString();
        String reversedWord = rs.reverseString("aryaman");
        System.out.println(reversedWord);
    }

    public String reverseString(String word) {
        char[] wordarray = word.toCharArray();
        int i = 0;
        int j = wordarray.length - 1;

        while (true) {
            if (i >= j) {
                String reversedWord = new String(wordarray);
                return reversedWord;
            }
            char temp = wordarray[i];
            wordarray[i] = wordarray[j];
            wordarray[j] = temp;

            i++;
            j--;
        }
    }

}
