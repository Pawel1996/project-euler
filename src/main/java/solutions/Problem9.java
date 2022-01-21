package solutions;

public class Problem9 {
    private static final int sum = 1000;
    private static final int exponent = 2;

    public static int solve() {
        int product = -1;

        for (int i = 1; i < sum; i++) {
            for (int j = i + 1; j < sum; j++) {
                for (int k = j + 1; k < sum; k++) {
                    if (Math.pow(i, exponent) + Math.pow(j, exponent) == Math.pow(k, exponent)) {
//                        System.out.println(i + ", " + j + ", " + k);
                        if (i + j + k == sum) {
                            product = i * j * k;
                            System.out.println("Those numbers are: " + i + ", " + j + ", " + k);
                        }
                    }
                }
            }
        }

        return product;
    }
}
