package com.timZhao.array.quickSort;
import com.timZhao.array.quickSort.Solution;
/**
 * @author ZhaoTong
 * @ProjectName myLeetCodeSchedule
 * @Description TODO
 * @time 2022/10/10 11:03
 */
public class Main {
    public static void main(String[] args) {
        Solution3 p = new Solution3();
        int[] nums = new int[]{3,6,1,0,7,12,-1};
        p.quickSort(nums, 0, nums.length - 1);
        for (int i:nums
             ) {
            System.out.println(i);
        }
    }
}
