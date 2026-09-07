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
    int i = 0;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int start = 0;
        int end = inorder.length-1;
        i = postorder.length-1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int id = 0; id < inorder.length; id++)
        {
            map.put(inorder[id], id);
        }
        return createNode(postorder, inorder, start, end, map);
    }

    public TreeNode createNode(int []postorder, int []inorder, int start, int end, HashMap<Integer, Integer> map)
    {
        if (start > end) return null;
        TreeNode root = new TreeNode(postorder[i]);
        int j =  map.get(root.val);
        i--;
        root.right = createNode(postorder, inorder, j+1, end, map);
        root.left = createNode(postorder, inorder, start, j-1, map);
        return root;
    }
}