package com.timZhao.stackAndQueue.p150evalRPN;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author ZhaoTong
 * @ProjectName myLeetCodeSchedule
 * @Description TODO
 * @time 2022/11/10 19:48
 */
public class Solution {
    public int evalRPN(String[] tokens) {
        Deque<String> deque = new LinkedList<>();
        for (String s:tokens
        ) {
            if (s.equals("+") ||s.equals("-") ||s.equals("*") ||s.equals("/")) {
                deque.push(judgeAndOp(s, deque));
                //System.out.println(Integer.parseInt(judgeAndOp(s, deque)));
            } else {
                deque.push(s);
            }
        }
        return Integer.parseInt(deque.peek());
    }

    public String judgeAndOp(String op, Deque<String> deque){
        String i = deque.peek();
        deque.pop();
        String j = deque.peek();
        deque.pop();
        if (op.equals("+")){
            return (Integer.parseInt(i)) + (Integer.parseInt(j)) + "";
        } else if (op.equals("-")) {
            return (Integer.parseInt(j)) - (Integer.parseInt(i)) + "";
        } else if (op.equals("*")) {
            return (Integer.parseInt(j)) * (Integer.parseInt(i)) + "";
        }else {
            return (Integer.parseInt(j)) / (Integer.parseInt(i)) + "";
        }
    }
}
