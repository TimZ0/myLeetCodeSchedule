package com.timZhao.tree.treeTraversal;

import com.timZhao.tree.buildATree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author ZhaoTong
 * @ProjectName myLeetCodeSchedule
 * @Description TODO
 * @time 2022/10/13 1:25
 */
public class Solution6 {
    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) return null;
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        stack.push(cur);
        while (cur.left != null || !stack.isEmpty()) {
            if(cur.left != null) {
                stack.push(cur.left);
                cur = cur.left;
            } else {
                cur = stack.peek();
                result.add(cur.val);
                stack.pop();

                //if (cur.right != null)   stack.push(cur.right);  这里超级容易错

                if (cur.right != null) {
                    cur = cur.right; // 这里有一种重新立root的感觉！！
                    stack.push(cur);
                } else {
                    cur.left = null; // 左边的已经都入栈了，所以剪枝一下
                }
            }
        }
        return result;
    }
}
