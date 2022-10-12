package com.timZhao.array.quickSort;

/**
 * @author ZhaoTong
 * @ProjectName myLeetCodeSchedule
 * @Description TODO
 * @time 2022/10/10 17:00
 */
public class Solution3 {
    public void quickSort(int[] nums, int left, int right){
        if (left > right) {
            return;
        };
        int p = partition(nums, left, right);
        quickSort(nums, left, p - 1);
        quickSort(nums, p + 1, right);
    }

    public int partition(int[] arr, int left, int right) {
        int part_it = arr[left];
        int temp = left;
        int i = left;
        for (; i <= right; i++) {
            if (arr[i] < part_it) {
                swap(arr, i, ++temp);
            }
        }
        swap(arr, temp, left);
        return temp;

    }

    public static void swap(int[] arr, int i, int j) {
        if (i == j) {
            return;
        }
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }
}
