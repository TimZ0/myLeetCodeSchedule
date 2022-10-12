package com.timZhao.array.mergeSort;

/**
 * @author ZhaoTong
 * @ProjectName myLeetCodeSchedule
 * @Description TODO
 * @time 2022/10/10 19:12
 */
public class Solution {
    public void mergeSort(int[] nums, int left, int right) {
        if (right - left == 0) {
            return;
        }
        int mid = (left + right) / 2;
        mergeSort(nums, left, mid);
        mergeSort(nums, mid + 1, right);
        merge(nums, left, mid, right);
    }

    public void merge(int[] nums, int left, int mid, int right) {
        int[] result = new int[right - left + 1];
        int i1 = left;
        int i2 = mid + 1;

        int k = 0;
        while(i1 <= mid && i2 <= right) {
            if(nums[i1] <= nums[i2]) {
                result[k++] = nums[i1++];
            } else {
                result[k++] = nums[i2++];
            }
        }

        while (i1 <= mid)
            result[k++] = nums[i1++];

        while (i2 <= right)
            result[k++] = nums[i2++];

        for (int i:result
             ) {
            nums[left++] = i;
        }
    }
}
