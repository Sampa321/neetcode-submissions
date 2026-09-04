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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int start = 0;
       int end = inorder.length-1;
       HashMap<Integer, Integer> map = new HashMap<>();
       for(int i = 0;i < inorder.length; i++)
       {
           map.put(inorder[i], i);
       } 
       return createNode(preorder, inorder, start, end, map);
    }
    int i = 0;
    public  TreeNode createNode(int []preorder, int []inorder, int start, int end, HashMap<Integer, Integer> map)
    {
       if(start > end) return null;
       TreeNode root = new TreeNode(preorder[i]);
       int j = map.get(preorder[i]);
       i++;
       root.left = createNode(preorder, inorder, start, j-1, map);
       root.right = createNode(preorder, inorder, j+1, end, map);
       return root;
    }
}
