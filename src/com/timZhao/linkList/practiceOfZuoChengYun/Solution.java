package com.timZhao.linkList.practiceOfZuoChengYun;
import com.timZhao.linkList.LinkListNode;

/**
 * @author ZhaoTong
 * @ProjectName myLeetCodeSchedule
 * @Description TODO
 * @time 2022/10/10 20:27
 */
public class Solution {
    public int findMiddle (LinkListNode head) {
        if (head == null) return -1;
        if (head.next == null ||head.next.next == null) return head.value;
        int result = -1;
        LinkListNode fast = head.next.next; //快指针
        LinkListNode slow = head.next;       //慢指针
        result = slow.value;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            result = slow.value;
            fast = fast.next.next;
        }
        return result;
    }
}
