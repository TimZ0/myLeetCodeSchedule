package com.timZhao.linkList.p143reorderList;

/**
 * @author ZhaoTong
 * @ProjectName myLeetCodeSchedule
 * @Description TODO
 * @time 2022/10/11 21:26
 */
class MyLinkedList {
    int val;
    MyLinkedList next;

    public MyLinkedList() {
    }

    public MyLinkedList(int val, MyLinkedList next) {
        this.val = val;
        this.next = next;
    }

    public int get(int index) {
        MyLinkedList p = this;
        if (p.next == null) return -1;
        int result = -1;
        for (int i = 0; i <= index; i++) {
            p = p.next;
            if(p != null) {
                result = p.val;
            } else {
                return -1;
            }
        }
        return result;
    }

    public void addAtHead(int val) {
        MyLinkedList head = this;
        MyLinkedList p = head.next;
        head.next = new MyLinkedList(val, p);
    }

    public void addAtTail(int val) {
        MyLinkedList tail = this;
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.next = new MyLinkedList(val, null);
    }

    public void addAtIndex(int index, int val) {
        MyLinkedList p = this;
        //获取链表中第 index 个节点的值。如果索引无效，则返回-1
        for (int i = 0; i <= index - 1; i++) {
            p = p.next;
        }
        MyLinkedList q = p.next;
        p.next = new MyLinkedList(val, q);
    }

    public void deleteAtIndex(int index) {
        MyLinkedList p = this;
        for (int i = 0; i <= index - 1; i++) {
            p = p.next;
        }
        if (p.next.next == null) {
            p.next = null;
        } else {
            p.next = p.next.next;
        }
    }
}

