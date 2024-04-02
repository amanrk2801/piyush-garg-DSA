package SpaceTimeComplexity;

public class Constant {
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4,5};

        // Add 10 to the first element of an array
        arr[0] = arr[0] + 10; // Time Complexity -> O(1)
        int num = arr[arr.length-1]; // space complexity -> int(4bytes) -> O(4)

        System.out.println(arr[0]); // Time C. -> O(1)

        // O(1) + O(1) = O(2) == O(1) // Constant time complexity
        // O(4bytes) = O(1) // Constant Space Complexity
    }
}
