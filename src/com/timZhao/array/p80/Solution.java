package com.timZhao.array.p80;

/**
 * @author ZhaoTong
 * @ProjectName myLeetCodeSchedule
 * @Description TODO
 * @time 2022/10/8 11:15
 */
public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0 || nums.length == 1 || nums.length == 2)
            return nums.length;
        int result = 2;
        for (int i = 2; i < nums.length; i++) {
            if (nums[result-2] != nums[i]) {
                nums[result++] = nums[i];
            }
        }
        return result;
    }
}
