package net.aryaman.algo.hackerrank;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SockMerchant {
	public static void main(String[] args) {
		SockMerchant s = new SockMerchant();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] array = new int[n];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = in.nextInt();
		}
		System.out.println(s.sockPairs(array));
		in.close();
	}
	public int sockPairs(int[] array) {
		Map<Integer, Integer> counts = new HashMap<>();
		
		for (int i : array) {
			if (!counts.containsKey(i)) {
				counts.put(i, 1);
			} else {
				int repeatCount = counts.get(i);
				repeatCount++;
				counts.put(i, repeatCount);
			}
		}
		int count = 0;
		
		for (int j : counts.values()) {
			if (j >= 2) {
				if (j % 2 != 0) {
					count += (j - 1) / 2;
				} else {
					count += j / 2;
				}
			}
		}
		return count;
	}
}
