package solutions;

public class Problem1 {
    private static final int maxNumber = 1000;

    public static int solve() {
        int sum = 0;
        for (int i = 0; i < maxNumber; i++)
            if (i % 3 == 0 || i % 5 == 0)
                sum += i;
        return sum;
    }
}
