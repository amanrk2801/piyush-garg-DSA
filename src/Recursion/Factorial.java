package Recursion;

import java.util.Scanner;

public class Factorial {
    public static int fact(int num){
        System.out.println("Calling fact of "+num);
        // Base Condition
        if(num <= 1)
            return 1;
        return num * fact(num-1);
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println("Factorial: " + fact(num));
    }
}
