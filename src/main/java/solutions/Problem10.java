package solutions;

public class Problem10 {
    private static final int upperBound = 2000000;

    public static long solve() {
        long sum = 0;

        for (long i = 0; i < upperBound; i++) {
            if (isPrime(i)) {
                sum += i;
//                System.out.println(i);
            }
        }

        return sum;
    }
    
    private static boolean isPrime(long number) {
//        System.out.println(number + ": ");
        if (number <= 1) {
            return false;
        }
        if (number == 2) {
            return true;
        }
        for (long i = 2; i <= Math.sqrt(number); i++) {
//            System.out.println(i);
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
