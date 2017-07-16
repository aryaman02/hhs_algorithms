package net.aryaman.algo.misc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

/**
 * @author aryamandas
 * 
 */
public class OmCalculator {
    private static final List<String> operations = Arrays.asList("+", "-", "*", "/");

    public static void main(String[] args) throws IOException {
        OmCalculator oc = new OmCalculator();

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("Enter the expression. Type quit to Quit");
            String expression = in.readLine();

            if (expression.equals("quit")) {
                System.out.println("Goodbye");
                break;
            }
            String[] inputArray = expression.split(" ");
            if (inputArray.length != 3) {
                System.out.println("Incorrect number of inputs");
            }

            double op1 = Double.valueOf(inputArray[0]);
            double op2 = Double.valueOf(inputArray[2]);
            String operation = inputArray[1];

            if (!operations.contains(operation)) {
                System.out.println("Incorrect operation");
                continue;
            }

            double result = oc.calculate(operation, op1, op2);
            System.out.println("The result is: " + result);


        }
        in.close();
    }

    public double calculate(String operation, double op1, double op2) {

        switch (operation) {
        case "+":
            return op1 + op2;

        case "-":
            return op1 - op2;

        case "*":
            return op1 * op2;

        case "/":
            return op1 / op2;

        default:
            return -1;
        }
    }
}
