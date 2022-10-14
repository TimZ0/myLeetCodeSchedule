package com.timZhao.tree.p113;
import com.timZhao.tree.buildATree.TreeNode;

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
        TreeNode root = new TreeNode(1, null, null);
        root.left = new TreeNode(2, null, null);
        root.right = new TreeNode(3, null, null);
        root.left.left = new TreeNode(4, null, null);
        root.left.right = new TreeNode(5, null, null);
        root.right.left = new TreeNode(6, null, null);

        Solution p = new Solution();
        List<List<Integer>> result = p.pathSum(root, 7);
        for (List<Integer> i:result
             ) {
            System.out.println(Arrays.toString(i.toArray()));
        }
    }
}
