class Solution {
    public boolean hasDuplicate(int[] nums) {
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for(int ele : nums)
        // {
        //     map.put(ele, map.getOrDefault(ele, 0)+1);
        // }
        // for(int value : map.values())
        // {
        //     if(value >= 2)
        //     {
        //         return true;
        //     }
        // }
        // return false;

        Arrays.sort(nums);
        for(int i = 0; i < nums.length-1; i++)
        {
            if(nums[i] == nums[i+1])
            {
                return true;
            }
        }
        return false;
    }
}