package net.aryaman.algo.matrix;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class HHSProgramming {

    static class Command {
        /**
         * @param name
         * @param value
         */
        public Command(String name, int value) {
            super();
            this.name = name;
            this.value = value;
        }

        String name;
        int value;
    }

    public static void main(String[] args) {
        List<Command> input = new ArrayList<>();

        input.add(new Command("ADD", 2));
        input.add(new Command("ADD", 3));
        input.add(new Command("DIV", 5));
        input.add(new Command("MUL", 20));
        input.add(new Command("COB", 4));

        HHSProgramming hsp = new HHSProgramming();
        System.out.println(hsp.medievalMath(0, 5, input, 4));
    }

    public int kangarooJoey(int[] array) {
        Map<Integer, Integer> numCounts = new HashMap<>();
        int clumps = 0;

        for (int i = 0; i < array.length; i++) {
            if (!numCounts.containsKey(array[i])) {
                numCounts.put(array[i], 1);

            } else {
                int count = numCounts.get(array[i]);
                count++;
                numCounts.put(array[i], count);
            }
        }
        for (Entry<Integer, Integer> countVals : numCounts.entrySet()) {
            System.out.println("key: " + countVals.getKey() + "  value: " + countVals.getValue());

            if (countVals.getValue() > 1) {
                clumps++;
            }
        }
        return clumps;
    }

    public int medievalMath(int m, int n, List<Command> input, int k) {
        if (m < 0 || m > 1000000) {
            return 0;
        } else if (n < 0 || n > 100) {
            return 0;
        } else if (k < 0 || k > 20) {
            return 0;
        } else if (input.size() != n) {
            return 0;
        }

        for (Command cmd : input) {
            if (cmd.name.equals("ADD")) {
                m += cmd.value;

            } else if (cmd.name.equals("SUB")) {
                m -= cmd.value;

            } else if (cmd.name.equals("MUL")) {
                m *= cmd.value;

            } else if (cmd.name.equals("DIV")) {
                m /= cmd.value;

            } else if (cmd.name.equals("COB")) {
                m = Integer.parseInt(String.valueOf(m), k);
            }
        }
        return m;
    }
}
