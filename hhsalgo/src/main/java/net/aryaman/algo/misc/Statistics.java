package net.aryaman.algo.misc;

public class Statistics {

	public void findRange(int[] array) {

		SimpleSort s = new SimpleSort();
		s.bubblesort(array);

		int smallnum = array[0];
		int largenum = array[array.length - 1];
		int range = largenum - smallnum;

		System.out.println("The range of the set is: " + range);
	}

	public void findMean(int[] array) {
		int total = 0;

		for (int val : array) {
			total = total + val;

		}
		int mean = total / array.length;
		System.out.println("The mean of the set is: " + mean);
	}

	public void findMedian(int[] array) {
		int lc = 0;
		int rc = array.length - 1;
		int median = 0;

		while (true) {

			if (lc > rc) {
				median = (array[lc] + array[rc]) / 2;
				break;

			} else if (lc == rc) {
				median = (array[lc] + array[rc]) / 2;
				break;
			}
			lc = lc + 1;
			rc = rc - 1;

		}
		System.out.println("The median of the list is: " + median);
	}
}
