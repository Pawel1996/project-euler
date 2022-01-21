package solutions;

public class Problem9 {
    private static final int sum = 1000;
    private static final int exponent = 2;

    // i cannot be bigger than 333, because j and k would have to be equal to at least 334 and 335 respectively.
    // Then the sum would be 1002 at least, which is wrong.
    // Similarly, j couldn't be equal to more than 500, because then k would have to be at least 501, and the sum would
    // also be at least 1002.
    // As for now I can't think of a better way to narrow it down, but this one works really fast for the given
    // numbers, even though there are 3 loops nested in each other.

    public static int solve() {
        for (int i = 1; i <= sum / 3; i++) {
            for (int j = i + 1; j <= sum / 2; j++) {
                for (int k = j + 1; i + j + k <= sum; k++) {
                    if (Math.pow(i, exponent) + Math.pow(j, exponent) == Math.pow(k, exponent)) {
                        System.out.println(i + ", " + j + ", " + k);
                        if (i + j + k == sum) {
                            return i * j * k;
                        }
                    }
                }
            }
        }

        return -1;
    }
}
