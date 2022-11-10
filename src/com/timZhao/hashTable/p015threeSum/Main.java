package com.timZhao.hashTable.p015threeSum;

import java.util.Arrays;

/**
 * @author ZhaoTong
 * @ProjectName myLeetCodeSchedule
 * @Description TODO
 * @time 2022/10/8 20:16
 */
public class Main {
    public static void main(String[] args) {
        Solution p = new Solution();
        System.out.println(Arrays.toString(p.threeSum(new int[]{1,1,-2}).toArray()));
        // 本题若使用像《四数相加》那种的哈希方法，很难去重
        // 四数相加那种是在四个数组里面，所以天然去重！但我们这个都是在一个数组中，由于数组元素可能重复，形成的三元组就有可能重复
        // 因此本题使用妖魔化的双指针





    }
}
