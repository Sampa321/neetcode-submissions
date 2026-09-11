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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> re = new ArrayList<>();
        if(root == null) return re;
        boolean reverse = false;
        Queue<TreeNode> qu = new LinkedList<>();
        Stack<Integer> st = new Stack<>();
        qu.add(root);
        while(!qu.isEmpty())
        {
            int size = qu.size();
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i < size; i++)
            {
                TreeNode temp = qu.poll();
                if(!reverse)
                {
                    list.add(temp.val);
                    if(temp.left != null) qu.add(temp.left);
                    if(temp.right != null) qu.add(temp.right);
                }
                else
                {
                    st.add(temp.val);
                    if(temp.left != null) qu.add(temp.left);
                    if(temp.right != null) qu.add(temp.right); 
                }
            }
            if(reverse)
            {
                while(!st.isEmpty())
                {
                    list.add(st.pop());
                }
            }
            re.add(list);
            reverse = !reverse;
        }
        return re;
    }
}