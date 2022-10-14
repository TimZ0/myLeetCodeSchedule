package com.timZhao.tree.treeTraversal;
import com.timZhao.tree.buildATree.TreeNode;

import java.util.List;

/**
 * @author ZhaoTong
 * @ProjectName myLeetCodeSchedule
 * @Description TODO
 * @time 2022/10/12 19:21
 */
public class Main {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1, null, null);
        root.left = new TreeNode(2, null, null);
        root.right = new TreeNode(3, null, null);
        root.left.left = new TreeNode(4, null, null);
        root.left.right = new TreeNode(5, null, null);
        root.right.left = new TreeNode(6, null, null);

        Solution4 p = new Solution4();
        List<Integer> result = p.preorderTraversal(root);
        for (int i:result) {
            System.out.println(i);
        }
    }
}
