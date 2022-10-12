package com.timZhao.array.p904;

/**
 * @author ZhaoTong
 * @ProjectName myLeetCodeSchedule
 * @Description TODO
 * @time 2022/10/8 13:56
 */
public class Solution {
    public int totalFruit(int[] fruits) {
        if (fruits.length <= 2) return fruits.length;
        int type1 = fruits[0];
        int type2 = fruits[0];
        int result = 2;
        int result_now = 1;
        int i = 1;
        for (; i < fruits.length; i++) {
            if (fruits[i] == type1) {
                result_now++;
                result = Math.max(result_now, result);
            } else {
                type2 = fruits[i];
                break;
            }
        }

        for (; i < fruits.length; i++) {
            if (fruits[i] == type1 || fruits[i] == type2) {
                result_now++;
            } else {
                type2 = fruits[i];
                result_now = 1;
                for (int j = i-1; j >= 0 ; j--) {
                    if (fruits[j] == type2) {
                        result_now++;
                    } else {
                        result_now++;
                        type1 = fruits[j];
                        for (int k = j-1; k >= 0; k--) {
                            if (fruits[k] == type1 || fruits[k] == type2) {
                                result_now++;
                            } else {
                                break;
                            }
                        }
                        break;
                    }
                }
            }
            result = Math.max(result_now, result);
        }
        return result;
    }
}
