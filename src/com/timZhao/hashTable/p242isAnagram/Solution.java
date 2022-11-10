package com.timZhao.hashTable.p242isAnagram;

/**
 * @author ZhaoTong
 * @ProjectName myLeetCodeSchedule
 * @Description TODO
 * @time 2022/10/8 20:16
 */
public class Solution {
    public boolean isAnagram(String s, String t) {
        int[] table = new int[26];
        for (int i = 0; i < s.length(); i++) {
            table[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            table[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (table[i] != 0)  return false;
        }
        return true;
    }
}
