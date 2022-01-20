package solutions;

public class Problem5 {
    private static final int upperBound = 20;

    public static long solve() {
        long answer = -1;
        boolean found = false;

        for (long i = 20; i < Long.MAX_VALUE; i++) {
            for (int j = 1; j <= upperBound; j++) {
                if (i % j != 0) {
                    break;
                }
                if (i % upperBound == 0) {
                    return i;
                }
            }
        }

        return answer;
    }
}
