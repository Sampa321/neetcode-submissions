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
    
    public List<Integer> inorderTraversal(TreeNode root) {
        Solution obj = new Solution();
        List<Integer> re = new ArrayList<>();
        obj.inorder(root, re);
        return re;
    }

    public void inorder(TreeNode root, List<Integer> re)
    {
        if(root == null) return;
        inorder(root.left, re);
        re.add(root.val);
        inorder(root.right, re);
    }
}