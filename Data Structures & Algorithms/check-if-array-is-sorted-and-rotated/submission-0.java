class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int c = 1;
        for(int i = 1; i < 2*nums.length; i++)
        {
            if(nums[(i-1)%n] <= nums[i%n]) c++;
            else c = 1;
            if(n == c) return true;
        }
        return n == 1;
    }
}