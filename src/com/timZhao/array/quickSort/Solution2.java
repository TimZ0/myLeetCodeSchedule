package com.timZhao.array.quickSort;

/**
 * @author ZhaoTong
 * @ProjectName myLeetCodeSchedule
 * @Description TODO
 * @time 2022/10/10 14:03
 */
public class Solution2 {
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
        while (i < right) {
            if(arr[i] <= part_it) {
                temp++;              // 快慢指针
                i++;
            } else {
                swap(arr, i, right);
                right--;            // 还有点对撞的感觉
            }
        }
        if (part_it >= arr[temp]) {
            swap(arr, temp, left);
            return temp;
        } else {
            swap(arr, temp-1, left);
            return temp-1;
        }    // 后面这个处理还是蛮复杂的，不如之前的对撞的方法好
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
