package com.timZhao.hashTable.p383canConstruct;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @author ZhaoTong
 * @ProjectName myLeetCodeSchedule
 * @Description TODO
 * @time 2022/10/8 20:16
 */
public class Solution {
    // 四数和是0，即target = 0
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] char1 = magazine.toCharArray();
        char[] char2 = ransomNote.toCharArray();

        int[] temp = new int[26];

        for (char i:char1
             ) {
            temp[i - 'a']++;  // 存入数组
        }

        for (char i:char2
        ) {
            temp[i - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (temp[i] < 0)    return false;
        }

        return true;
    }
}
