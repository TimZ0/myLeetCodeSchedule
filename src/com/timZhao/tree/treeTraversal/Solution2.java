package com.timZhao.tree.treeTraversal;

import com.timZhao.tree.buildATree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author ZhaoTong
 * @ProjectName myLeetCodeSchedule
 * @Description TODO
 * @time 2022/10/12 19:37
 */
public class Solution2 {
    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) return null;
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur;

        stack.push(root);
        while (!stack.isEmpty()) {
            cur = stack.peek();
            result.add(cur.val);
            stack.pop();
            if (cur.right != null)   stack.push(cur.right);
            if (cur.left != null)   stack.push(cur.left);
        }
        return result;
    }
}
