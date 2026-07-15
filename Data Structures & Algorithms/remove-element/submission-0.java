class Solution {
    public int removeElement(int[] nums, int val) {
        int []arr = new int[nums.length];
        int c = 0;
        for(int i = 0;i < nums.length;i++)
        {
            int ele = nums[i];
            if(ele == val)
            {
                continue;
            }
            arr[c] = nums[i];
            c++;
        }
        for(int i = 0; i < arr.length;i++){
            nums[i] = arr[i];
        }
        return c; 
    }
}