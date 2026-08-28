class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele : nums)
        {
            map.put(ele, map.getOrDefault(ele, 0)+1);
        }
        int res = 0;
        for(int c : map.values())
        {
            res += c*(c-1)/2;
        }
        return res;
    }
}