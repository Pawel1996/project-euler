package solutions;

public class Problem3 {
    private static final long givenNumber = 600851475143l;

    public static long solve() {
        long largestPrimeFactor = -1;
        long givenNumberSqrt = (long) Math.ceil(Math.sqrt(givenNumber));

        for (long i = 2; i < givenNumberSqrt; i++) {
            if (givenNumber % i == 0) {
                long secondFactor = givenNumber / i;
                System.out.println(i + " * " + secondFactor + " = " + i * secondFactor);

                if (isPrime(i) && i > largestPrimeFactor) {
                    largestPrimeFactor = i;
                }
                else if (isPrime(secondFactor) && secondFactor > largestPrimeFactor) {
                    largestPrimeFactor = secondFactor;
                }
            }
        }

        return largestPrimeFactor;
    }

    private static boolean isPrime(long number) {
        if (number == 0 || number == 1)
            return false;
        for (int i = 2; i < number; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

}
