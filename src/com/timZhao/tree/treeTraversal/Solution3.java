package com.timZhao.tree.treeTraversal;

import com.timZhao.tree.buildATree.BinaryTreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author ZhaoTong
 * @ProjectName myLeetCodeSchedule
 * @Description TODO
 * @time 2022/10/12 19:52
 */
public class Solution3 {
    public List<Integer> preorderTraversal(BinaryTreeNode root) {
        if (root == null) return null;
        List<Integer> result = new ArrayList<>();
        Stack<BinaryTreeNode> stack = new Stack<>();
        BinaryTreeNode cur;

        stack.push(root);
        while (!stack.isEmpty()) {
            cur = stack.peek();
            result.add(cur.val);
            stack.pop();
            if (cur.left != null)   stack.push(cur.left);
            if (cur.right != null)   stack.push(cur.right);
        }
        List<Integer> result2 = new ArrayList<>();
        for (int i = result.size()-1; i >= 0 ; i--) {
            result2.add(result.get(i));
        }
        return result2;
    }
}
