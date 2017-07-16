package net.aryaman.algo.misc;
import java.util.Random;

public class BinarySearch {

	public void guessNumber() {
		int min = 0;
		int max = 1000;
		int median = 0;
		int count = 0;
		Random num1 = new Random();
		int secretnum = num1.nextInt(1000);

		while (true) {
			System.out.println("min: " + min + " max: " + max);
			count = count + 1;
			if (secretnum == min) {
				System.out.println("I found the number: " + secretnum);
				break;
			}

			if (secretnum == max) {
				System.out.println("I found the number: " + secretnum);
				break;
			}

			median = (min + max) / 2;

			if (secretnum > median) {
				min = median+1;

			} else if (secretnum < median) {
				max = median-1;
			} else {
				System.out.println("I found the number: " + secretnum);
				break;
			}
		}
		System.out.println("It took: " + count);

	
	}
}
