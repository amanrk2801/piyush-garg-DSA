package LevelupBitwiseOperators;

class Convertor{

    public int toDecimal(int binary){
        int result = 0;
        int index = 0;

        while (binary != 0){
            int lastDigit = binary % 10;
            if(lastDigit ==1)
                result = result + (int) Math.pow(2,index);
            index = index + 1;
            binary = binary / 10;
        }
        return result;
    }
    public String toBinary(int decimal){
        String result = "";

        while (decimal!=0){
            int lastBit = decimal & 1;
            result = lastBit + result;
            decimal = decimal >> 1;
        }
        return result;
    }
}

public class DecimalToBinary {
    public static void main(String[] args) {

        Convertor convertor = new Convertor();
        System.out.println(convertor.toBinary(10));
        System.out.println(convertor.toBinary(11));
        System.out.println(convertor.toBinary(23));

        System.out.println(convertor.toDecimal(1010));
        System.out.println(convertor.toDecimal(1011));
        System.out.println(convertor.toDecimal(1111));

        /*
        // Decimal to Binary
        Scanner scanner = new Scanner(System.in);

        long startTime = System.currentTimeMillis();

        System.out.println("Enter a Decimal Number: ");
        int number = scanner.nextInt();

        String result = "";

        while (number>0){
            int rem = number % 2;
            number = number / 2;
            result = rem + result;
        }
        System.out.println(result);

        long endTime = System.currentTimeMillis();

        System.out.println("Time taken by the program: " + (endTime - startTime) + " milliseconds");
    */
    }
}

/* Algorithm
1. Take an input from user
loop until num>0
    rem = num % 2
    num = num / 2
    res = rem + res
end loop
print res
 */
