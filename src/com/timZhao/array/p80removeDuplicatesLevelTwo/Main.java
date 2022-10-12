package com.timZhao.array.p80removeDuplicatesLevelTwo;

/**
 * @author ZhaoTong
 * @ProjectName myLeetCodeSchedule
 * @Description TODO
 * @time 2022/10/8 11:14
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{1,3,3,3,5,5,8,8,8,9,12};
        Solution P = new Solution();
        int result = P.removeDuplicates(nums);
        System.out.println("删除后数组的长度是：" + result);
        for (int j = 0; j < result; j++) {
            System.out.println(nums[j]);
        }
    }
}
