package com.timZhao.array.p34;

/**
 * @author ZhaoTong
 * @ProjectName myLeetCodeSchedule
 * @Description TODO
 * @time 2022/10/7 22:15
 */
public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = findLeft(nums, target);
        result[1] = findRight(nums, target);
        return result;
    }

    public int findLeft(int[] nums, int target) {
        if (nums.length == 0)   return -1;
        int left = 0;
        int right = nums.length - 1;
        int mid = -2;
        while (left <= right) {
            mid = (left + right)/2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if (left < 0 || left >= nums.length) return -1;
        else if(nums[left] != target) return -1;
        else return left;
    }

    public int findRight(int[] nums, int target) {
        if (nums.length == 0)   return -1;
        int left = 0;
        int right = nums.length - 1;
        int mid = -1;
        while (left <= right) {
            mid = (left + right) / 2;
            if (nums[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if (right < 0 || right >= nums.length) return -1;
        else if(nums[right] != target) return -1;
        else return right;
    }
}
