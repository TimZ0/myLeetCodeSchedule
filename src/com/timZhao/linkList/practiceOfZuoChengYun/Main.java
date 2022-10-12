package com.timZhao.linkList.practiceOfZuoChengYun;
import com.timZhao.linkList.LinkListNode;
/**
 * @author ZhaoTong
 * @ProjectName myLeetCodeSchedule
 * @Description TODO
 * @time 2022/10/10 20:27
 */
public class Main {
    public static void main(String[] args) {
        Solution p = new Solution();
        LinkListNode temp = new LinkListNode(1,null);
        temp = new LinkListNode(3, temp);
        temp = new LinkListNode(5, temp);
        temp = new LinkListNode(7, temp);
        temp = new LinkListNode(9, temp);
        temp = new LinkListNode(11, temp);
        LinkListNode head = new LinkListNode(13, temp);
        int k = p.findMiddle(head);
        System.out.println(k);
    }
}
