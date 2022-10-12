package com.timZhao.tree.treeTraversal;

import com.timZhao.tree.buildATree.BinaryTreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ZhaoTong
 * @ProjectName myLeetCodeSchedule
 * @Description TODO
 * @time 2022/10/12 19:27
 */
public class Solution {
    public List<Integer> preorderTraversal(BinaryTreeNode root) {
        List<Integer> result = new ArrayList<>();
        preorder(root, result);
        return result;
    }

    public void preorder(BinaryTreeNode root, List<Integer> result) {
        if (root == null) return;
        preorder(root.left, result);
        preorder(root.right, result);
        result.add(root.val);
    }
}
