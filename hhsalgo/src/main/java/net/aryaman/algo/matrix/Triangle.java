package net.aryaman.algo.matrix;

public class Triangle {

    private static final double SMALL_DELTA = 0.00002;

    public static void main(String[] args) {
        Triangle t = new Triangle();
        System.out.println(t.typeOfTriangle(2.0, 2.0, 2 * Math.sqrt(2)));
    }

    public boolean isTriangle(double a, double b, double c) {
        if (a + b > c && a + c > b && b + c > a) {
            return true;
        } else {
            return false;
        }
    }

    public double heronsFormula(double a, double b, double c) {
        if (isTriangle(a, b, c) == false) {
            return 0;
        } else {
            double s = (a + b + c) / 2;
            return Math.sqrt(s * (s-a) * (s-b) * (s-c));
        }
    }
    public String typeOfTriangle(double a, double b, double c) {
        if (isTriangle(a, b, c) == false) {
            return null;

        } else if (a == 0 && b == 0 && c == 0) {
            return null;

        } else {
            if (a == b && b == c && a == c) {
                return "Equilateral";
            }
            if (isoscelesTriangle(a, b, c) == "Isosceles" && rightTriangle(a, b, c) == "Right") {
                return "Right and Isosceles";
            } else if (isoscelesTriangle(a, b, c) == null && rightTriangle(a, b, c) == "Right") {
                return "Right";
            } else if (isoscelesTriangle(a, b, c) == "Isosceles" && rightTriangle(a, b, c) == null) {
                return "Isosceles";
            }
        }
        return null;
    }
    public String isoscelesTriangle(double a, double b, double c) {
        if (a == b || b == c || a == c) {
            return "Isosceles";
        } else {
            return null;
        }
    }

    public String rightTriangle(double a, double b, double c) {
        if (almostEqual(a * a + b * b, c * c) || almostEqual(a * a + c * c, b * b) || almostEqual(b * b + c * c, a * a)) {
            return "Right";
        } else {
            return null;
        }
    }

    private boolean almostEqual(double a, double b) {
        if (a - b < SMALL_DELTA) {
            return true;
        } else {
            return false;
        }
    }
}
