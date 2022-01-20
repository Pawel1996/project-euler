package solutions;

public class Problem2 {
    private static final int upperBound = 4000000;

    public static int solve() {
        int sumOfEvenValuedTerms = 0;
        int fiboNumber;
        int n = 1;

        while (true) {
            fiboNumber = countFibonacci(n);
            if (fiboNumber > upperBound)
                break;

            if (fiboNumber % 2 == 0)
                sumOfEvenValuedTerms += fiboNumber;

            n++;
        }

        return sumOfEvenValuedTerms;
    }

    private static int countFibonacci(int n) {
        int previous = 1;
        int current = 2;

        if (n == 1)
            return previous;
        if (n == 2)
            return current;

        for (int i = 3; i <= n; i++) {
            int temp = current;
            current += previous;
            previous = temp;
        }

        return current;
    }

    public static int solveInOneMethod() {
        int sumOfEvenValuedTerms = 2;
        int previous = 1;
        int current = 2;

        while (true) {
            int temp = current;
            current += previous;
            previous = temp;

            if (current > upperBound)
                break;

            if (current % 2 == 0)
                sumOfEvenValuedTerms += current;
        }

        return sumOfEvenValuedTerms;
    }
}
