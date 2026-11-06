class Solution {
    public TreeNode traverse(int []nums, int start, int end)
    {
        if(start > end) return null;
        int mid = start + (end-start)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = traverse(nums, start, mid-1);
        root.right = traverse(nums, mid+1, end);
        return root;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return traverse(nums, 0, nums.length-1);
    }
}
