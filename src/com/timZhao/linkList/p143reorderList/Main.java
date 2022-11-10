package com.timZhao.linkList.p143reorderList;

/**
 * @author ZhaoTong
 * @ProjectName myLeetCodeSchedule
 * @Description TODO
 * @time 2022/10/11 21:25
 */
public class Main {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList(1,null);
        linkedList.addAtTail(2);
        linkedList.addAtTail(3);
        linkedList.addAtTail(4);
        linkedList.addAtTail(5);

        MyLinkedList p = linkedList;

        Solution s = new Solution();
        s.reorderList(p);


        while (p != null) {
            System.out.println(p.val);
            p = p.next;
        }
    }
}
