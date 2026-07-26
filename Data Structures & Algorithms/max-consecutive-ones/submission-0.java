class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maximum = 0;
        int currMax = 0;
        for(int ele : nums)
        {
            if(ele == 1)
            {
                currMax += 1;
                maximum = Math.max(currMax, maximum);
            }
            else
            {
                currMax = 0;
            }
        }
        return maximum;
    }
}