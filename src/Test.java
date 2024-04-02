public class Test {
    public int[] getConcatenation(int[] nums) {
        // Calculate the total length of the concatenated array
        int totalLength = nums.length * 2;

        // Create a new array with the total length
        int[] concatenatedArray = new int[totalLength];

        // Copy the elements of nums to the concatenatedArray array twice
        for (int i = 0; i < nums.length; i++) {
            concatenatedArray[i] = concatenatedArray[i + nums.length] = nums[i];
        }

        return concatenatedArray;
    }

    public static void main(String[] args) {
        Test Test = new Test();

        // Example usage:
        int[] nums = {1, 2, 1};
        int[] concatenatedArray = Test.getConcatenation(nums);

        // Print the concatenated array
        System.out.println("Concatenated Array:");
        for (int num : concatenatedArray) {
            System.out.print(num + " ");
        }
    }
}
