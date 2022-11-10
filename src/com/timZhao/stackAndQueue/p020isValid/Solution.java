package com.timZhao.stackAndQueue.p020isValid;

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
    public boolean isValid(String s) {
        Deque<Character> stack = new LinkedList<>();
        char[] chars = s.toCharArray();
        for (char i:chars
             ) {
            if (i == '(' || i == '{' || i == '[') {
                stack.add(i);
            } else {
                if (stack.isEmpty())    return false;
                else {
                    char temp = stack.peekLast();
                    System.out.println(temp);
                    //if (i != temp)  return false;
                    if (temp == '(' && i == ')');
                    else if (temp == '[' && i == ']');
                    else if (temp == '{' && i == '}');
                    else return false;
                    stack.pop();}
            }
        }
        return stack.isEmpty();
    }
}
