package com.timZhao.hashTable.p904;
import java.util.HashMap;

/**
 * @author ZhaoTong
 * @ProjectName myLeetCodeSchedule
 * @Description TODO
 * @time 2022/10/8 21:03
 */
public class Solution {
    public int totalFruit(int[] fruits) {
        if (fruits.length == 0) return 0;
        Collect collect = new Collect();
        int j = 0;
        int result = 0;
        for (int i = 0; i < fruits.length; i++) {
            collect.add(fruits[i]);
            while (collect.size() >= 3) {
                collect.removeIt(fruits[j]); //正常remove就可以，因为后面的那个总会划走的，直到是2中水果
                j++;
            }
            result = Math.max(result, i - j + 1);
        }
        return result;
    }
}

class Collect extends HashMap<Integer, Integer> {
    public void add(Integer key) {
        if (super.containsKey(key))
            super.put(key, super.get(key)+1);
        else {
            super.put(key, 1);
        }
    }

    public void removeIt(Integer key) {
        if (super.get(key) <= 1)
            super.remove(key);
        else {
            super.put(key, super.get(key)-1);
        }
    }
}
