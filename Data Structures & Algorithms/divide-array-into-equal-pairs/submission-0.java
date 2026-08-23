class Solution {
    public boolean divideArray(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int i = 0; 
        while(i < n)
        {
            int j = i;
            while(j < n && nums[i] == nums[j])
            {
                j++;
            }
            if((j-i) % 2 != 0) return false;
            i = j;
        }
        return true;
    }
}