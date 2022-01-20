package solutions;

public class Problem6 {
    private static final int upperBound = 100;
    private static final int exponent = 2;

    public static long solve() {
        long answer;
        long sumOfTheSquares = 0;
        long sum = 0;
        long squareOfTheSum;

        for (int i = 1; i <= upperBound; i++) {
            sumOfTheSquares += Math.pow(i, exponent);
            sum += i;
        }
        squareOfTheSum = (long) Math.pow(sum, exponent);

        answer = squareOfTheSum - sumOfTheSquares;

        return answer;
    }
}
