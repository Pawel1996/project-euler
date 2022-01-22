package solutions;

public class Problem10 {
    private static final int upperBound = 2000000;

    public static long solve() {
        long sum = 0;

        for (long i = 0; i < upperBound; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }

        return sum;
    }
    
    private static boolean isPrime(long number) {
        if (number <= 1) {
            return false;
        }
        if (number == 2) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }
        for (long i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
