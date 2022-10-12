package com.timZhao.array.p34;

/**
 * @author ZhaoTong
 * @ProjectName myLeetCodeSchedule
 * @Description TODO
 * @time 2022/10/7 22:28
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{1,3,5,8,8,8,9,12};
        Solution P = new Solution();
        int[] result = P.searchRange(nums, 10);
        for (int i:result
             ) {
            System.out.println(i);
        }
    }
}
