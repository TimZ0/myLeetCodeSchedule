package com.timZhao.linkList.p143reorderList;

/**
 * @author ZhaoTong
 * @ProjectName myLeetCodeSchedule
 * @Description TODO
 * @time 2022/11/2 15:46
 */
public class Solution {
    public void reorderList(MyLinkedList head) {
        // 明显是对撞指针，但是链表的对撞咋做啊，从后往前遍历咋玩？反转链表？好像只能这样了......
        // 并且更需要注意，不能全部反转！！不然head会变
        // 所以要先先平均切割，再正序第一部分，反转后一部分！
        // 平均分割的话使用快慢指针即可，一个的速度是另一个速度的2倍（一个移动两步，一个一步）

        if (head == null || head.next == null)  return;
        // 平均分割
        MyLinkedList slow = head;
        MyLinkedList fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        fast = slow.next;
        slow.next = null;
        fast = reverseList(fast);  // 实现反转

        MyLinkedList i = head;
        MyLinkedList j = fast;

         //开始拼接
        while (j != null) {
            MyLinkedList temp_i = i.next;
            MyLinkedList temp_j = j.next;

            // 插入
            i.next = j;
            j.next = temp_i;

            // 更新
            i = temp_i;
            j = temp_j;
        }
    }

    public MyLinkedList reverseList(MyLinkedList head) {
        // 后序递归实现反转链表
        // 跳出条件
        if (head == null || head.next == null) return head;

        // 后序，遍历到最后返回的结果（反转后的新head）
        MyLinkedList result = reverseList(head.next);

        head.next.next = head;// 反转头结点
        head.next = null;// 空标志结尾

        return result;
    }


}
