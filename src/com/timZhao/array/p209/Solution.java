package com.timZhao.array.p209;

import com.sun.xml.internal.fastinfoset.tools.XML_SAX_StAX_FI;

/**
 * @author ZhaoTong
 * @ProjectName myLeetCodeSchedule
 * @Description TODO
 * @time 2022/10/8 15:44
 */
public class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        if (nums.length == 0) return 0;
        int total = 0;
        for (int k:nums
             ) {
            total += k;
        }
        if (total < target) return 0;

        int left = 0;
        int sum = 0;
        int result = nums.length;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (sum >= target && left < right) {
                result = Math.min(result, right - left + 1);
                sum -= nums[left++];
            }
        }
        return result;
    }
}
