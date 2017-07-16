package net.aryaman.algo.matrix;

import java.util.PriorityQueue;
import java.util.Random;

public class PQDriver {

    public static void main(String[] args) {
        int size = 10;
        PriorityQueue<Integer> pq = new PriorityQueue<>(size);
        Random r = new Random();

        for (int i = 0; i < 50; i++) {
            int newNum = r.nextInt(200);
            System.out.print(" " + newNum);
            pq.add(newNum);

            if (pq.size() > size) {
                pq.poll();
            }
            //pq.add(newNum);
        }

        System.out.println();

        System.out.println("PQ contents");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}
