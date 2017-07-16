package net.aryaman.algo.matrix;

public class PythagoreanTriples {
    public static void main(String[] args) {
        PythagoreanTriples pt = new PythagoreanTriples();
        System.out.println(pt.isPythagoreanTriple(1, 0, 75));
    }

    public boolean isPythagoreanTriple(int a, int b, int c) {
        if (a == 0) {
            return false;

        } else if (b == 0) {
            return false;

        } else if (c == 0) {
            return false;
        }
        if (Math.pow(c, 2) == Math.pow(b, 2) + Math.pow(a, 2)) {
            return true;

        } else {
            return false;
        }
    }
}
