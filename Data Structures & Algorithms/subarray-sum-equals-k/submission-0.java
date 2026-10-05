class Solution {
     
    public int subarraySum(int[] nums, int k) {
        return subarray(nums, k, 0);
    }

    public int subarray(int []nums, int k, int c)
    {
        if(c == nums.length) return 0; 
        int count = 0;
        int sum = 0;
        for (int i = c; i < nums.length; i++) 
        {
            sum += nums[i];

            if (sum == k) {
                count++;
            }
        }
        return count + subarray(nums, k, c+1);
    }
}