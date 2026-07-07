class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        combination(nums, target, result, list,0);
        return result;
    }
    public static void combination(int []nums, int target, List<List<Integer>> result, ArrayList<Integer> list, int c)
    {
        if(target == 0)
        {
            result.add(new ArrayList<>(list));
            return;
        }
        if(nums.length == c)
        {
            return;
        }
        if(nums[c] <= target)
        { 
            list.add(nums[c]); 
            combination(nums, target - nums[c], result, list, c);
            list.removeLast();
        } 
        combination(nums, target, result, list, c+1);
    }
}
