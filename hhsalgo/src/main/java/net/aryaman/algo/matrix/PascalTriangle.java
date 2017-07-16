package net.aryaman.algo.matrix;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.math3.util.ArithmeticUtils;

public class PascalTriangle {
    public static void main(String[] args) {
        PascalTriangle pt = new PascalTriangle();
        //pt.pascalTriangle(10);
        Long[] pascalRow = pt.pascalRow(8);
        System.out.println(Arrays.toString(pascalRow));

        //System.out.println(ArithmeticUtils.factorial(5));

    }
    public void pascalTriangle(int n) {
        int[] prevRow = null;
        for (int i = 1; i <= n; i++) {

            int[] row = new int[i];
            row[0] = 1;
            row[i-1] = 1;

            for (int j = 1; j < i - 1; j++) {
                row[j] = prevRow[j] + prevRow[j-1];
            }

            System.out.println(Arrays.toString(row));
            prevRow = row;
        }
    }
    public Long[] pascalRow(int n) {

        int newNum = n-1;

        List<Long> row = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            long element = ArithmeticUtils.factorial(newNum) / (ArithmeticUtils.factorial(newNum-i))
                    * 1 / (ArithmeticUtils.factorial(i));

            row.add(element);

        }
        return row.toArray(new Long[row.size()]);
    }
}
