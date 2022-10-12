package com.timZhao.tree.buildATree;

/**
 * @author ZhaoTong
 * @ProjectName myLeetCodeSchedule
 * @Description TODO
 * @time 2022/10/12 19:19
 */
public class BinaryTreeNode {
    public int val;
    public BinaryTreeNode left;
    public BinaryTreeNode right;

    public BinaryTreeNode(){
    }

    public BinaryTreeNode(int val, BinaryTreeNode left, BinaryTreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
