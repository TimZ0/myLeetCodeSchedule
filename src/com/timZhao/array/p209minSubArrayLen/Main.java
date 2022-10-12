package com.timZhao.array.p209minSubArrayLen;

/**
 * @author ZhaoTong
 * @ProjectName myLeetCodeSchedule
 * @Description TODO
 * @time 2022/10/8 15:44
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{2,3,1,2,4,3};
        Solution P = new Solution();
        int result = P.minSubArrayLen(7, nums);
        System.out.println(result);
    }
}
