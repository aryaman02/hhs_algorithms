package net.aryaman.algo.misc;

import java.util.Date;

public class ArrayDriver {
    public static void main(String[] args) {
        //int[] array = new int[] {4,5,3,3,8,2,9,6 };

        //SimpleSort s = new SimpleSort();
        //int[] array = s.generateArray(20);
        //int[] array = {2, 5, 7, 9, 10, 1, 54,18};

        //int[] array = {5};
        //s.printArray(array);
        //s.smallnumtotop(array, 0);
        //s.bubblesort(array);
        //s.printArray(array);
        //Statistics r = new Statistics();

        //r.findMedian(array);
        //PrimeNumbers p = new PrimeNumbers();
        //p.generatePrimeNumbers(100);
        Date startTime = new Date();
        System.out.println(startTime.toString());
        //p.primeNumRange(100000);

        Date endTime = new Date();
        System.out.println(endTime.toString());

        Math3 m = new Math3();
        m.isEven(21);
        System.out.println(m.isDivisibleByThree(4975));
    }

    private void showHowToIterateArray() {
        int[] teachArray = {2, 5, 7, 9, 10, 1, 54};

        for (int val : teachArray) {
            System.out.println(val);
        }

        for (int index = 0; index < teachArray.length-1; index++) {
            System.out.println(teachArray[index]);
        }
    }

}
