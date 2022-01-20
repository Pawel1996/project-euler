package solutions;

public class Problem5 {
    private static final int upperBound = 200;

    public static long solve() {
        long answer = -1;
        boolean found;

        for (long i = upperBound; i < Long.MAX_VALUE; i++) {
            found = true;
            for (int j = 1; j <= upperBound; j++) {
                if (i % j != 0) {
                    found = false;
                    break;
                }
            }
            if (found) {
                answer = i;
                break;
            }
        }

        return answer;
    }
}
