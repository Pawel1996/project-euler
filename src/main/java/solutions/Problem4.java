package solutions;

public class Problem4 {


    public static int solve() {
        int largestPalindrome = -1;

        for (int i = 100; i < 1000; i++) {
            for (int j = i; j < 1000; j++) {
                int product = i * j;
                if (isPalindrome(product)) {
                    if (product > largestPalindrome){
                        largestPalindrome = product;
                    }
                }
            }
        }

        return largestPalindrome;
    }

    private static boolean isPalindrome(int number) {
        String original = Integer.toString(number);
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = original.length() - 1; i >= 0; i--) {
            stringBuilder.append(original.charAt(i));
        }
        String reversed = stringBuilder.toString();

        return reversed.equals(original);
    }
}
