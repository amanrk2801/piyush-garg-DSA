package SpaceTimeComplexity;

public class Log {
    public static void main(String[] args) {
        int[] arr = new int[] {10,20,30,40,50};

        // Task is to find 40 in the given array
        long startTime = System.nanoTime();
        for (int i = 0; i < arr.length; i++) { // T.C O(n)
            if(arr[i] == 40){
                System.out.println("Linear search 40 at index " + i);
            }
        }

        long endTime = System.nanoTime();
        System.out.println("Linear search Took " + (endTime - startTime));

        // O(logn) -> T.C
        startTime = System.nanoTime();
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = (start + end) /2;
            if (arr[mid]==40){
                System.out.println("Binary Search 40 at index " + mid);
                break;
            } else if (arr[mid]<40) {
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        endTime = System.nanoTime();
        System.out.println("Binary search Took " + (endTime - startTime));
    }
}
