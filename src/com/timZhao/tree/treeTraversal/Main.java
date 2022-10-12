package com.timZhao.tree.treeTraversal;
import com.timZhao.tree.buildATree.BinaryTreeNode;

import java.util.Arrays;
import java.util.List;

/**
 * @author ZhaoTong
 * @ProjectName myLeetCodeSchedule
 * @Description TODO
 * @time 2022/10/12 19:21
 */
public class Main {
    public static void main(String[] args) {
        BinaryTreeNode root = new BinaryTreeNode(1, null, null);
        root.left = new com.timZhao.tree.buildATree.BinaryTreeNode(2, null, null);
        root.right = new com.timZhao.tree.buildATree.BinaryTreeNode(3, null, null);
        root.left.left = new com.timZhao.tree.buildATree.BinaryTreeNode(4, null, null);
        root.left.right = new com.timZhao.tree.buildATree.BinaryTreeNode(5, null, null);
        root.right.left = new BinaryTreeNode(6, null, null);

        Solution4 p = new Solution4();
        List<Integer> result = p.preorderTraversal(root);
        for (int i:result) {
            System.out.println(i);
        }
    }
}
