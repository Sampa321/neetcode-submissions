class Solution {
    public int firstMissingPositive(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int ele : nums)
        {
            list.add(ele);
        }
        int start = 1;
        while(true)
        {
            if(!list.contains(start))
            {
                return start;
            }
            start += 1;
        } 
    }
}