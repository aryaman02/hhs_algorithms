package net.aryaman.algo.misc;

public class SortDriver {

    public static void main(String[] args) {
        SimpleSort ss = new SimpleSort();
        int[] array = ss.generateArray(7);

        ss.printArray(array);


        int pos = ss.findLargestNumberIndex(array, 0);
        System.out.println(pos);
        int largenum = array[pos];
        System.out.println(largenum);

        System.out.println("Begin SelectionSort");

        int[] clonedarray = new int[array.length];
        System.arraycopy(array, 0, clonedarray, 0, array.length);

        ss.selectionSort(array);

        ss.selectionSortReverse(clonedarray);
        //ss.bubblesort(array);
        //ss.printArray(array);
    }
}
