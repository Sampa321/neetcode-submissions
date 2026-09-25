class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low = 0;
        int high = nums.length-1;
        while(low <= high)
        {
            int mid = low + (high - low)/2;
            if((mid-1 < 0 || nums[mid-1] != nums[mid]) && (mid+1 == nums.length || nums[mid] != nums[mid+1]))
            {
                return nums[mid];
            }
            int leftSize = (mid - 1 >= 0 && nums[mid - 1] == nums[mid]) ? mid -1 : mid;
            if(leftSize % 2 == 1)
            {
                high = mid-1;
            }
            else
            {
                low = mid + 1;
            }
        }
        return -1;
    }
}