package MyArrays.Leetcode;

/*https://leetcode.com/problems/rotate-array/description/*/
public class RotateArray {
    public static void rotate(int[] nums, int k) {
        int len = nums.length;
        int[] result = new int[len];

        for(int i=0; i<len; i++){
            result[(i+k)%len] = nums[i];
        }
        for(int i=0; i<len; i++){
            nums[i] = result[i];
        }
    }

    public static void main(String[] args) {
        RotateArray rotate = new RotateArray();
        int[] nums = {1,2,3,4,5,6,7};
        int k=3;
        RotateArray.rotate(nums, k);
        for(int num: nums)
            System.out.print(num + " ");
    }
}
