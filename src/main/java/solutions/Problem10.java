package solutions;

public class Problem10 {


    public static long solve() {

        for (long i = 0; i < 20; i++) {
            System.out.println(i + ": " + isPrime(i));
        }

        return -1;
    }
    
    private static boolean isPrime(long number) {
        if (number <= 1) {
            return false;
        }
        for (long i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
