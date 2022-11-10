package com.timZhao.hashTable.p454fourSumCount;

import java.util.HashMap;

/**
 * @author ZhaoTong
 * @ProjectName myLeetCodeSchedule
 * @Description TODO
 * @time 2022/10/8 20:16
 */
public class Solution {
    // 四数和是0，即target = 0
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        HashMap<Integer, Integer> map = new HashMap<>();
        // a+b的结果存入map中，k存a+b的值，v存a+b出现的次数
        for (int i : nums1) {
            for (int j : nums2) {
                if (map.containsKey(i + j)) {
                    map.put(i + j, map.get(i + j) + 1); // 更新次数
                } else
                    map.put(i + j, 1); // 存入
            }
        }
        int result = 0;
        for (int i : nums3) {
            for (int j : nums4) {
                if (map.containsKey(-i - j)) {
                    result += map.get(-i - j); // 更新次数
                }
            }
        }
        return result;
    }
}
