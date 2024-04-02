package BitwiseOperators;
/* https://leetcode.com/problems/number-of-1-bits/description/ */
public class leetcode_191 {
    public static void main(String[] args) {
        int n = 0b00000000000000000000000000001011; // Binary representation of 11
        int result = 0;

        while (n != 0) {
            int lastBit = n & 1;
            if (lastBit == 1)
                result++;
            n = n >> 1;
        }
        System.out.println(result); // Print the result instead of returning it
    }
}
