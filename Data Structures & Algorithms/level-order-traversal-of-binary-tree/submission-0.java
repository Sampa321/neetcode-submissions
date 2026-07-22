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

    public int height(TreeNode root)
    {
        if(root == null) return 0;
        return Math.max(height(root.left), height(root.right)) +1;
    }

    public void addNode(int k, TreeNode root, List<Integer> list)
    {
        if(root == null) return;
        if(k == 0)
        {
            list.add(root.val);
            return;
        }
        addNode(k-1, root.left, list);
        addNode(k-1, root.right, list);
    }

    List<List<Integer>> re = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
       int h = height(root);
       for(int i = 0; i < h; i++)
       {
            List<Integer> list = new ArrayList<>();
            addNode(i, root, list);
            re.add(list);
       } 
       return re;
    }
}
