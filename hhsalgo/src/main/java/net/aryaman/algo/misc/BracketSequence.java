package net.aryaman.algo.misc;

public class BracketSequence {
    public static void main(String[] args) {
        BracketSequence bs = new BracketSequence();
        boolean flag = bs.isValidBracketSequence("()()()(");
        System.out.println(flag);
    }

    public boolean isValidBracketSequence(String sequence) {
        if (sequence.isEmpty() || sequence == null) {
            return false;
        }
        char[] sequenceArray = sequence.toCharArray();
        int xcount = 0;
        int ycount = 0;

        for (char c : sequenceArray) {
            if (c == '(') {
                xcount++;
            }

            if (c == ')') {
                ycount++;
            }

            if (xcount >= ycount) {
                /*
                 * We are good, keep going
                 */
            } else {
                return false;
            }

        }

        if (xcount == ycount) {
            return true;
        } else {
            return false;
        }
    }
}
