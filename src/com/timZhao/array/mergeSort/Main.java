package com.timZhao.array.mergeSort;

import com.timZhao.array.mergeSort.Solution;

/**
 * @author ZhaoTong
 * @ProjectName myLeetCodeSchedule
 * @Description TODO
 * @time 2022/10/10 19:12
 */
public class Main {
    public static void main(String[] args) {
        Solution p = new Solution();
        int[] nums = new int[]{3,6,1,0,7,12,-1};
        p.mergeSort(nums, 0, nums.length - 1);
        for (int i:nums
        ) {
            System.out.println(i);
        }
    }
}
