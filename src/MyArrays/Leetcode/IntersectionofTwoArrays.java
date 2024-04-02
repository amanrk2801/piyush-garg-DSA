package MyArrays.Leetcode;

import java.util.*;
import java.util.stream.Collectors;

/*https://leetcode.com/problems/intersection-of-two-arrays/description/*/
public class IntersectionofTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2){
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0;
        int j = 0;

        Set<Integer> set = new HashSet<>();

        while (i<nums1.length&&j<nums2.length){
            if(nums1[i] == nums2[j]){
                set.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i]<nums2[j]) {
                i++;
            }else j++;
        }
        int[] result = new int[set.size()];
        int index = 0;
        for(Integer num:set){
            result[index] = Integer.parseInt(num.toString());
            index++;
        }
        return result;
    }

    public static void main(String[] args) {
        IntersectionofTwoArrays intersection = new IntersectionofTwoArrays();
        int[] nums1 = {1,2,2,1,4,9,5}; int[] nums2 = {2,2,4,9,8};
        int[] result = intersection.intersection(nums1,nums2);
        System.out.println(Arrays.toString(result));
    }
}
