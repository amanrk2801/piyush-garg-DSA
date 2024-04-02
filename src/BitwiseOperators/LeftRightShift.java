package BitwiseOperators;

public class LeftRightShift {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;

        System.out.println("a & b: " + (a&b));
        System.out.println("a | b: " + (a|b));
        System.out.println("~a: " + (~a));
        System.out.println("a^b: " + (a^b));
        System.out.println("10<<1: " + (10<<1));
        System.out.println("10>>1: " + (10>>1));
    }
}

/*
3 = 0000 0000 0000 0011
if first bit is 0 then it is a positive number
if first bit is 1 then it is a negative number

2's complement
0000 0000 0000 0011
1111 1111 1111 1100
-----------------------
0000 0000 0000 0011
+                 1
------------------------
0000 0000 0000 0100 -> -4
 */
