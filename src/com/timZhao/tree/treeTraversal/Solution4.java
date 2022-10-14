package com.timZhao.tree.treeTraversal;

import com.timZhao.tree.buildATree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author ZhaoTong
 * @ProjectName myLeetCodeSchedule
 * @Description TODO
 * @time 2022/10/12 19:55
 */
public class Solution4 {
    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) return null;
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while (cur != null || !stack.isEmpty()) {
            if(cur != null) {
                stack.push(cur);
                cur = cur.left;
            } else {
                cur = stack.peek();
                result.add(cur.val);
                stack.pop();

                //if (cur.right != null)   stack.push(cur.right);  这里超级容易错
                cur = cur.right; // 这里有一种重新立root的感觉！！
            }
        }
        return result;
    }
}
