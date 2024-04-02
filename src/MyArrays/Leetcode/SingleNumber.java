package MyArrays.Leetcode;
/*https://leetcode.com/problems/single-number/description/*/
public class SingleNumber {
    public int singleNumber(int[] nums){
        int ans =0;
        for(int num: nums){
            ans = ans ^ num;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {2,2,1};
        SingleNumber singleNumber = new SingleNumber();
        int result = singleNumber.singleNumber(nums);
        System.out.println("This single number is: "+result);
    }
}
