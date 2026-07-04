class Solution {
    public int findMin(int[] nums) {
        int minimum = Integer.MAX_VALUE;
        for(int ele : nums)
        {
            minimum = Math.min(minimum,ele);
        }
        return minimum;
    }
}
