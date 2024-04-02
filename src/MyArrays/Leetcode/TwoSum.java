package MyArrays.Leetcode;

import java.util.HashMap;
import java.util.Map;

/*https://leetcode.com/problems/two-sum/*/
public class TwoSum {
//    public int[] twoSum(int[] nums, int target){
//        int size = nums.length;
//        for(int i = 0; i<size-1; i++){
//            int targetNumber = target - nums[i];
//            for(int j=i+1; j<size; j++){
//                if(nums[j] == targetNumber){
//                    return new int[]{i,j};
//                }
//            }
//        }
//        return new int[] {-1,-1};
//    }

    public int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int targetNum = target - nums[i];
            if(map.containsKey(targetNum)){
                // We found Solution
                return new int[] {map.get(targetNum), i};
            }else {
                map.put(nums[i], i);
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 22; // for example, assuming the target is 9

        int[] result = twoSum.twoSum(nums, target);

        System.out.println("Indices of the two numbers whose sum is equal to the target:");
        System.out.println(result[0] + " " + result[1]);
    }

}
