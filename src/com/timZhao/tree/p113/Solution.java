package com.timZhao.tree.p113;
import com.timZhao.tree.buildATree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ZhaoTong
 * @ProjectName myLeetCodeSchedule
 * @Description TODO
 * @time 2022/10/14 8:45
 */
public class Solution {
    public void travel(TreeNode root, int targetSum, List<List<Integer>> result, List<Integer> temp) {
        if (root == null) return;

        temp.add(root.val);
        if (root.right == null && root.left == null) {
            if (targetSum - root.val == 0) {
                List<Integer> path = new ArrayList<>(temp);
                result.add(path);
                return;
            }
        }
        travel(root.left, targetSum - root.val, result, temp);
        travel(root.right, targetSum - root.val, result, temp);
        temp.remove(temp.size()-1);
    }

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if (root == null) return new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        travel(root, targetSum, result, temp);
        return result;
    }
}

