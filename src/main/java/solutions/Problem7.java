package solutions;

public class Problem7 {
    private static final int primeToFindNumber = 10001;


    public static long solve() {
        long answer = -1;
        int numberOfPrimesFound = 0;
        boolean isPrime;

        for (long i = 2; i < Long.MAX_VALUE; i++) {
            isPrime = true;
            for (long j = 2; j < i; j++) {
               if (i % j == 0) {
                    isPrime = false;
                   break;
               }
            }
            if (isPrime) {
                numberOfPrimesFound++;
                if (numberOfPrimesFound == primeToFindNumber) {
                    answer = i;
                    break;
                }
            }
        }
        return answer;
    }
}
