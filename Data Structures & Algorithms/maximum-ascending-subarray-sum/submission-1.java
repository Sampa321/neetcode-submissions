class Solution {
    public int maxAscendingSum(int[] nums) {
        int maxSum = 0;
        int n = nums.length;
        int currSum = 0;
        for(int i = 0; i < n-1; i++)
        {
            if(nums[i] >= nums[i+1])
            {
                currSum += nums[i];
                maxSum = Math.max(maxSum, currSum);
                currSum = 0;
            }
            else
            {
               currSum += nums[i]; 
               maxSum = Math.max(maxSum, currSum);
            }
        }
        if(nums[n-1] > nums[n-2]) 
        {
            currSum += nums[n-1]; 
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }
}