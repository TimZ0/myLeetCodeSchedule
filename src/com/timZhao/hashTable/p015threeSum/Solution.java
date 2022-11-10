package com.timZhao.hashTable.p015threeSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @author ZhaoTong
 * @ProjectName myLeetCodeSchedule
 * @Description TODO
 * @time 2022/10/8 20:16
 */
public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();

        // 本题若使用像《四数相加》那种的哈希方法，很难去重
        // 四数相加那种是在四个数组里面，所以天然去重！但我们这个都是在一个数组中，由于数组元素可能重复，形成的三元组就有可能重复
        // 因此本题使用妖魔化的双指针
        Arrays.sort(nums); // 排序

        if (nums[0] > 0)    return result;
        if (nums[0] == 0 && nums[nums.length-1] == 0)  {
            path.add(0);
            path.add(0);
            path.add(0);
            result.add(path);
            return result;
        }

        for (int i = 0; i < nums.length-2; i++) {
            if (i != 0 && nums[i] == nums[i-1]) continue; // 去重，注意i！=0这个点
            int left = i + 1;
            int right = nums.length - 1; // 双指针初始
            while (left < right) {
                if (nums[i] + nums[left] + nums[right] == 0) {
                    path = new ArrayList<>();
                    path.add(nums[i]);
                    path.add(nums[left]);
                    path.add(nums[right]);
                    result.add(path);
                    right--;
                    while (nums[right] == nums[right+1] && left < right)  right--;        //  去重
                    left++;
                    while (nums[left] == nums[left-1] && left < right)    left++;        //  去重

                } else if (nums[i] + nums[left] + nums[right] > 0) {  // 数值过大，right左移
                    right--;
                    while (nums[right] == nums[right+1] && left < right)  right--;        //  去重
                } else {
                    left++;// 数值过小，left右移
                    while (nums[left] == nums[left-1] && left < right)    left++;        //  去重
                }
            }
        }


        return result;
    }
}
