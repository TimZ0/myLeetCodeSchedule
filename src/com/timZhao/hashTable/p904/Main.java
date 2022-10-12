package com.timZhao.hashTable.p904;
import com.timZhao.hashTable.p904.Solution;

/**
 * @author ZhaoTong
 * @ProjectName myLeetCodeSchedule
 * @Description TODO
 * @time 2022/10/8 21:03
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,1,1,2,3,3,4};
        Solution P = new Solution();
        int result = P.totalFruit(nums);
        System.out.println(result);
    }
}
