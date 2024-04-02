package MyArrays.Leetcode;

/* https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/description/ */
public class ArrayIsSorted {
    public boolean check(int[] nums){
        int gCount = 0;

        for (int i = 1; i < nums.length; i++){
            if (nums[i - 1] > nums[i]){
                gCount++;
            }
        }
        if (nums[nums.length - 1] > nums[0]){
            gCount++;
        }
        return gCount <= 1;
    }

    public static void main(String[] args) {
        ArrayIsSorted arrIsSort = new ArrayIsSorted();
        int[] nums = {3, 4, 5, 1, 2};

        System.out.println(arrIsSort.check(nums));
    }
}
