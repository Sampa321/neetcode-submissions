class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        subset(result, list, 0, nums);
        return result;
    }
    public static void subset(List<List<Integer>> result, ArrayList<Integer> list, int c, int []nums)
    {
        if(c == nums.length)
        {
            result.add(new ArrayList<>(list));
            return;
        }
        subset(result, list, c+1, nums);
        list.add(nums[c]);
        subset(result, list, c+1, nums);
        list.removeLast();
    } 
}
