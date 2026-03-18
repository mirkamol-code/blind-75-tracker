package com.mirkamolcode.week_2;

public class InvertBinaryTree {
    public  class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    /**
     * @Time complexity: O(n)
     * @Space complexity: O(n)
     * @param root
     */
    public TreeNode invertTreeByDFS(TreeNode root) {
        if (root == null) return null;

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invertTreeByDFS(root.left);
        invertTreeByDFS(root.right);
        return root;
    }
}
