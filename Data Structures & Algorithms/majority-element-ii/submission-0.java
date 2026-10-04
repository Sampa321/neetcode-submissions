class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length/3;
        List<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for(int num : nums)
        {
            if(map.get(num) > n)
            {
                if(!result.contains(num))
                {
                    result.add(num);
                }
            }
        }
        return result;
    }
}