class Solution {
    public int[] productExceptSelf(int[] nums) {
        int zero = 0;
        int product = 1;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] == 0)
            {
                zero++;
                continue;
            }
            product *= nums[i];
        }
        int []re = new int[nums.length];
        if(zero == 0)
        {
            for(int i = 0; i < nums.length; i++)
            {
                re[i] = product/nums[i];
            }
        }
        else if(zero == 1)
        {
            for(int i = 0; i < nums.length; i++)
            {
                if(nums[i] == 0)
                {
                    re[i] = product;
                    continue;
                }
                re[i] = 0;
            }
        }
        else
        {
            for(int i = 0; i < nums.length; i++)
            {
                re[i] = 0;
            }
        }
        return re;
    }
}  
