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
    public int minDiffInBST(TreeNode root) {
        Deque<TreeNode> stack=new ArrayDeque<>();TreeNode current=root;int previous=-1,answer=100001;while(current!=null||!stack.isEmpty()){while(current!=null){stack.push(current);current=current.left;}current=stack.pop();if(previous>=0)answer=Math.min(answer,current.val-previous);previous=current.val;current=current.right;}return answer;

    }
}
