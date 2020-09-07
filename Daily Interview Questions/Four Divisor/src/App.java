public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    // O(N)
    public int sumFourDivisors(int[] nums) {
        int sum = 0;
        for (int n : nums) {
            sum += getDivisorStatus(n);
        }

        return sum;
    }

    // O(sqrt(N))
    public int getDivisorStatus(int number) {
        int tempSum = 0, limit = (int) Math.sqrt(number), count = 0;

        for (int n = 1; n <= limit; n++) {
            if (number % n == 0) {
                tempSum += n;
                tempSum += number / n;
                count += n == number / n ? 1 : 2;
            }
        }

        return count == 4 ? tempSum : 0;
    }
}
