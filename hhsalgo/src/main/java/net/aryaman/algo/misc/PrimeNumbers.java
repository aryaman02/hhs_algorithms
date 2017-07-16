package net.aryaman.algo.misc;
import java.util.ArrayList;
import java.util.List;
public class PrimeNumbers {
    public static void main(String[] args) {
        PrimeNumbers pn = new PrimeNumbers();
        System.out.println(pn.isPrime(1));
    }
    public boolean isPrime(int number) {

        for (int i = 2; i <= number / 2; i++) {
            int remainder = number % i;

            if (remainder == 0) {
                return false;
            }
        }
        return true;
    }
    public void primeNumRange(int range) {
        int number = 2;
        int count = 0;

        while (true) {
            boolean flag2 = isPrime(number);

            if (flag2 == true) {
                count = count + 1;
                System.out.println(number);

            }
            if (number >= range) {
                break;
            }
            number = number + 1;
        }
        System.out.println("Number of prime numbers: " + count);
    }
    public List<Integer> primeFactors(int number) {
        List<Integer> primeFactors = new ArrayList<>();

        for (int i = 2; i < number / 2; i++) {
            int remainder = number % i;

            if (remainder == 0) {
                if (isPrime(i) == true) {
                    primeFactors.add(i);
                }
            }
        }
        return primeFactors;
    }
    public int maxPrime(int num) {
        int i = 0;

        while (i*i <= num) {
            i++;

            if (i*i > num) {
                return (i-1) * (i-1);
            }
        }
        return 0;
    }
}
