package net.aryaman.algo.misc;

public class RaceTrack {

    public static void main(String[] args) {

        Conversion myConversion = new Conversion();
        myConversion.convertToBinary(100);
        myConversion.convertToBinaryUsingStack(100);

        SumofDigits mySumofDigits = new SumofDigits();

        BinarySearch bs = new BinarySearch();
        bs.guessNumber();

        BinaryToDecimal b = new BinaryToDecimal();
        b.binaryToDecimal("11111");

        Math3 o = new Math3();
        o.createoddnumbers(25);
        o.divisionfunction(128, 13);
        //o.generateStars();
        //o.createtriangle(8);
        //o.createtriangle2(8);
        o.multiplication(28, 12);
    }
}
