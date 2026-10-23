class Solution {
    public int arraySign(int[] nums) {
        int neg = 0;
        for(int ele : nums)
        {
            if(ele == 0) return 0;
            if(ele < 0) neg++;
        }
        return neg % 2 == 0? 1: -1;
    }
}