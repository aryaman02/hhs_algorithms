package net.aryaman.algo.misc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Conversion {
	
	public void convertToBinary(int number) {
		int remainder = 0;
		
		List<Integer> binarylist = new ArrayList<Integer>();

		while (number > 0) {
			remainder = number % 2;
			number = number / 2;
			
			binarylist.add(remainder);

			if (remainder == 1) {
				if (number == 0) {
					break;
				}
			}
		}
		
		Collections.reverse(binarylist);

		for (int i : binarylist) {
			System.out.print(i);
		}
		System.out.println();
	}
	
	public void convertToBinaryUsingStack(int number) {
		int remainder = 0;
		
		Stack<Integer> binarystack = new Stack<Integer>();

		while (number > 0) {
			remainder = number % 2;
			number = number / 2;
			
			binarystack.push(remainder);
		}
		/*
		while (binarystack.size() > 0) {
			int item = binarystack.pop();
			System.out.print(item);
		} */
		
		while (true) {
			if (binarystack.size() > 0) {
				int item = binarystack.pop();
				System.out.print(item);
			} else {
				break;
			}
		}
		
		
		System.out.println();
	}
}
