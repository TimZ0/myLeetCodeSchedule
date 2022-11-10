package com.timZhao.stackAndQueue.p1047removeDuplicates;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

/**
 * @author ZhaoTong
 * @ProjectName myLeetCodeSchedule
 * @Description TODO
 * @time 2022/11/10 19:48
 */
public class Solution {
    public String removeDuplicates(String s) {
        if (s.length() == 0 || s.length() == 1) return s;
        Deque<Character> deque = new LinkedList<>();
        deque.push(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (!deque.isEmpty() && s.charAt(i) == deque.peek()) {
                deque.pop();
                continue;
            } else {
                deque.push(s.charAt(i));
            }
        }
        char[] result = new char[deque.size()];
        int i = 0;
        while (!deque.isEmpty()) {
            result[i++] = deque.peekLast();
            deque.removeLast();
        }

        return String.copyValueOf(result);
    }
}
