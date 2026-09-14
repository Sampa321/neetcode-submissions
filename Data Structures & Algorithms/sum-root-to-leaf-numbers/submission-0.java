/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int res = 0;
    public int sumNumbers(TreeNode root) {
        if(root == null) return res;
        res = 0;
        int sum = root.val;
        sumValue(root, sum);
        return res;
    }
    public void sumValue(TreeNode root, int sum)
    {
        if(root.left == null && root.right == null)
        {
            res += sum;
            return;
        }
        if(root.left != null) sumValue(root.left, sum*10+root.left.val);
        if(root.right != null) sumValue(root.right, sum*10+root.right.val);
    }
}