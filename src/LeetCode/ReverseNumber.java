package LeetCode;

public class ReverseNumber {
    public static void main(String[] args) {
        int num = 123456789;
        int result = 0;

        while (num != 0) {
            int lastDigit = num % 10;

            // Check for overflow before updating the result
            if (result < Integer.MIN_VALUE / 10 || result > Integer.MAX_VALUE / 10) {
                System.out.println("Overflow occurred");
                return; // Return early if overflow occurs
            }

            result = result * 10 + lastDigit;
            num = num / 10;
        }
        System.out.println(result);
    }
}
