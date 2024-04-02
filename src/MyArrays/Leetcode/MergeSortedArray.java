package MyArrays.Leetcode;

import java.util.Arrays;

/*https://leetcode.com/problems/merge-sorted-array/description/*/
public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = 0;

        for (int i = m; i < nums1.length; i++) {
            nums1[i] = nums2[index];
            index++;
        }
        Arrays.sort(nums1);
    }

    public static int[] fastmerge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0; // nums1
        int j = 0; // nums2
        int[] arr = new int[nums1.length];
        int index = 0; // arr

        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                arr[index] = nums1[i];
                index++;
                i++;
            } else {
                arr[index] = nums2[j];
                index++;
                j++;
            }
        }
        while (i < m) {
            arr[index] = nums1[i];
            index++;
            i++;
        }
        while (j < n) {
            arr[index] = nums1[i];
            index++;
            j++;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] nums2 = new int[]{2, 5, 6};
        int m = 3;
        int n = 3;

        long st = System.nanoTime();
//        merge(nums1, m, nums2, n);
        long end = System.nanoTime();

//        System.out.println(Arrays.toString(nums1) + " Time Taken " + (end - st));

        st = System.nanoTime();
        nums1 = fastmerge(nums1, m, nums2, n);
        end = System.nanoTime();

        System.out.println(Arrays.toString(nums1) + " Time Taken " + (end - st));


    }
}
