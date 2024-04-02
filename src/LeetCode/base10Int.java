package LeetCode;

class Solution {
    public int bitwiseComplement(int n) {
        int num = n; // copy of original
        int mask = 0;

        while (num!=0){
            mask = mask << 1 | 1;
            num = num >> 1;
        }
        return (~n) & mask;
    }
}

public class base10Int {
    public static void main(String[] args) {
        // Create an instance of Solution class
        Solution solution = new Solution();

        // Input integer
        int n = 7;

        // Calculate the bitwise complement using the provided method
        int complement = solution.bitwiseComplement(n);

        // Print the result
        System.out.println("Bitwise complement of " + n + " is: " + complement);
    }
}

/*
5 -> 101
0000 0000 0000 0101 -> 5

    1111 1111 1111 1010 -> ~5
  & 0000 0000 0000 0111 -> x (mask)
    --------------------------------
    0000 0000 0000 0010 -> result

    1111 1111 1111 1010 -> ~n
  & 0000 0000 0000 0111 -> mask
    ----------------------------
    0000 0000 0000 0010 -> result

Result = ~n & mask
 */