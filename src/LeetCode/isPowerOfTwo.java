package LeetCode;

public class isPowerOfTwo {
    public static void main(String[] args) {
        int n = 8;
        if(n <= 0){
            System.out.println("False");
            return; // Added return statement to exit the program if n is non-positive
        }
        while (n != 1){
            int lastBit = n & 1;
            n = n >> 1;
            if (lastBit != 0) {
                System.out.println("False");
                return; // Added return statement to exit the program if the last bit is not 0
            }
        }
        System.out.println("True");
    }
}
