class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        boolean []track = new boolean[nums.length];
        permutation(nums, result, list, track);
        return result;
    }
    public static void permutation(int []nums, List<List<Integer>> result, ArrayList<Integer> list, boolean []track){
        if(nums.length == list.size())
        {
            result.add(new ArrayList<>(list));
            return;
        }
        for(int i = 0; i < nums.length; i++)
        {
            if(!track[i])
            {
                list.add(nums[i]);
                track[i] = true;
                permutation(nums, result, list, track);
                list.removeLast();
                track[i] = false;
            }
        }
    }
}
