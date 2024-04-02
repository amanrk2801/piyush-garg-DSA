package MyArrays.Leetcode;
/*https://leetcode.com/problems/move-zeroes/description/*/

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                index++;
            }
        }
    }

    public static void main(String[] args) {
        MoveZeroes move = new MoveZeroes();
        int[] nums = {1,2,0,9,0,6,0,5,0,30};
        move.moveZeroes(nums);
        for(int num: nums)
            System.out.print(num+" ");
    }
}
