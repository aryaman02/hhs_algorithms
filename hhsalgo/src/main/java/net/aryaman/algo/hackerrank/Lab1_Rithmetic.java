package net.aryaman.algo.hackerrank;

public class Lab1_Rithmetic
{
    public static void main(String[] args)
    {
        int myId,numLet;
        int intResult;
        double dblResult; //used to express the result in decimal in Expressions 3 & 5

        myId = 20313496;
        numLet = 6;

        System.out.println("My first name is Sepehr");
        System.out.println("My Student Id is " + myId);
        System.out.println("The Number of characters in my name is " + numLet);

        intResult = myId % 7; //Expression #1
        System.out.println("\nExpression #1 is equal to " + intResult);

        intResult = numLet % 5; //Expression #2
        System.out.println("\nExpression #2 is equal to " + intResult);

        double dblmyId = myId; //used to express decimals
        double dblnumLet = numLet; //used to express decimals
        dblResult = dblmyId / (dblnumLet+900); //Expression #3
        System.out.println("\nExpression #3 is equal to " + dblResult);

        intResult = 1+2+3+4+5+numLet; //Expression #4
        System.out.println("\nExpression #4 is equal to " + intResult);

        dblResult = 10000 / (80 + (dblmyId - 123456) / ((dblnumLet + 20) *
                (dblnumLet + 20))); //Expression #5
        System.out.println("\nExpression #5 is equal to " + dblResult);

        /*--------------------------------Run-----------------------------------
      My first name is Sepehr
      My Student Id is 20313496
      The Number of characters in my name is 6

      Expression #1 is equal to 0

      Expression #2 is equal to 1

      Expression #3 is equal to 22421.077262693158

      Expression #4 is equal to 21

      Expression #5 is equal to 2.0190165E7
      ----------------------------------------------------------------------*/

    }

}
