package com.timZhao.tree.treeTraversal;

import com.timZhao.tree.buildATree.BinaryTreeNode;

import java.util.*;

/**
 * @author ZhaoTong
 * @ProjectName myLeetCodeSchedule
 * @Description TODO
 * @time 2022/10/12 20:35
 */
public class Solution5 {
    public List<List<Integer>> levelOrder(BinaryTreeNode root) {
        if(root ==null)  return new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        BinaryTreeNode cur = root;
        queue.add(cur);
        int size;
        List<Integer> temp;
        while(!queue.isEmpty()) {
        size = queue.size();
        temp = new ArrayList<Integer>();
        for (int i = 0; i < size; i++) {

            cur = queue.poll();
            if (cur != null) {
                temp.add(cur.val);
                if (cur.left != null) queue.add(cur.left);
                if (cur.right != null) queue.add(cur.right);
            }
        }
            result.add(temp);
        }
        return result;
    }
}
