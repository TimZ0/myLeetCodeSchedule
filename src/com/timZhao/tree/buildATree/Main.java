package com.timZhao.tree.buildATree;

/**
 * @author ZhaoTong
 * @ProjectName myLeetCodeSchedule
 * @Description TODO
 * @time 2022/10/12 19:21
 */
public class Main {
    public static void main(String[] args) {
        BinaryTreeNode root = new BinaryTreeNode(1, null, null);
        root.left = new BinaryTreeNode(2, null, null);
        root.right = new BinaryTreeNode(3, null, null);
        root.left.left = new BinaryTreeNode(4, null, null);
        root.left.right = new BinaryTreeNode(5, null, null);
        root.right.left = new BinaryTreeNode(6, null, null);
    }
}
