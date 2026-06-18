class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int []re = new int[2];
        for(int i = 0; i < nums.length; i++)
        {
            int check = target - nums[i];
            if(map.containsKey(check))
            {
                re[0] = map.get(check);
                re[1] = i;
                return re;
            }
            map.put(nums[i], i);
        }
        re[0] = -1;
        re[1] = -1;
        return re;
    }
}
