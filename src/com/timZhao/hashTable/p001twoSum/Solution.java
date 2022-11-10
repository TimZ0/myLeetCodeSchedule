package com.timZhao.hashTable.p001twoSum;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @author ZhaoTong
 * @ProjectName myLeetCodeSchedule
 * @Description TODO
 * @time 2022/10/8 20:16
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int k = nums[i];
            if (map.containsKey(target - k)) {
                return new int[]{map.get(target - k),1};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
}
