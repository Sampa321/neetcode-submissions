class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(candidates);
        combination(candidates, target, result, list,0);
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
        for(int i = c; i< nums.length; i++)
        {
            if(i > c && nums[i] == nums[i-1]) {continue;}
            if(target < nums[i]) break;
            list.add(nums[i]);
            combination(nums, target-nums[i], result, list, i+1);
            list.removeLast();
        }
    }
}
