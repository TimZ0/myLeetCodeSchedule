package com.timZhao.linkList.p707designMyLinkedList;

/**
 * @author ZhaoTong
 * @ProjectName myLeetCodeSchedule
 * @Description TODO
 * @time 2022/10/11 21:25
 */
public class Main {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.addAtHead(1);
        linkedList.addAtIndex(1,2);
        linkedList.addAtTail(3);
        linkedList.deleteAtIndex(1);

        MyLinkedList p = linkedList;

        while (p != null) {
            System.out.println(p.val);
            p = p.next;
        }

        System.out.println(linkedList.get(1));

    }
}
