package BitwiseOperators;

import java.lang.reflect.Array;
import java.util.Arrays;

/* https://leetcode.com/problems/counting-bits/description/ */
public class leetcode_338 {
    public static void main(String[] args) {
        // f(i) : i's number of 1's in bitmask
        // f(i) : f(i/2) + i % 2
        int n = 5;
        int[] ans = new int[n+1];

        for (int i=1; i<=n; i++)
            ans[i] = ans[i>>1]+(i&1);

        System.out.println(Arrays.toString(ans));
    }
}
