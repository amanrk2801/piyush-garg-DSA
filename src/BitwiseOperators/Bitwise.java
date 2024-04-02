package BitwiseOperators;

import java.util.Scanner;

public class Bitwise {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        if ((number & 1) == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
        System.out.println("Time millis " + (System.currentTimeMillis() - start));
    }
}

/*
number = 10
 1010
&   1 -> Bitwise AND
-----
    0 -> if the number bitwise AND with 1 and the ans last bit 0 then it is an even number
------------------
number = 10
 1010
|   1 -> Bitwise OR
-----
    1 -> if the number bitwise OR with 1 and the ans last bit 1 then it is an odd number
 */
