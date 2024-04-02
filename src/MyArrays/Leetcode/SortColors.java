package MyArrays.Leetcode;

import java.util.Arrays;

/*https://leetcode.com/problems/sort-colors/description/*/
public class SortColors {
    public void sortColors(int[] arr){
        int low = 0;
        int high = arr.length-1;
        int i=0;

        while (i<=high){
            if(arr[i]==1){
                // Ignore
                i++;
            } else if (arr[i]==0) {
                int temp = arr[i];
                arr[i] = arr[low];
                arr[low] = temp;
                low++;
                i++;
            }else {
                int temp = arr[i];
                arr[i] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }

    public static void main(String[] args) {
        SortColors sort = new SortColors();
        int[] nums = {2,0,2,1,2,1,0};
        sort.sortColors(nums);
        for (int i=0; i<nums.length; i++){
            System.out.print(nums[i]+ ",");
        }
    }
}
