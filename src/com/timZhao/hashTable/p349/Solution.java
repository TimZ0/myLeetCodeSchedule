package com.timZhao.hashTable.p349;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * @author ZhaoTong
 * @ProjectName myLeetCodeSchedule
 * @Description TODO
 * @time 2022/10/8 20:16
 */
public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> result = new ArrayList<>();
        for (int i:nums1
             ) {
            set.add(i);
        }
        for (int i:nums2
             ) {
            if (set.contains(i)) {
                result.add(i);
            }
        }
        int[] re = new int[result.size()];
        int index = 0;
        for (int i:result
             ) {
            re[index++] = i;
        }
        return re; //包装类咋转换来着？
    }
}
