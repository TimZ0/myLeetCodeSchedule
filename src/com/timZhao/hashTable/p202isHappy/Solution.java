package com.timZhao.hashTable.p202isHappy;

import java.util.HashSet;

/**
 * @author ZhaoTong
 * @ProjectName myLeetCodeSchedule
 * @Description TODO
 * @time 2022/10/8 20:16
 */
public class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> s = new HashSet<>();
        while (n != 1) {
            if (s.contains(n))    return false; // 每轮循环，都判断set里面是否有重复，重复的话就是死循环，结果为false
            int temp = 0;
            while (n - 10 >= 0) {
                temp += (n % 10) * (n % 10); // 快乐数计算
                n = n / 10;
            }
            s.add(temp);
            n = temp;
        }
        return true;
    }
}
