class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        subset(nums, 0, new ArrayList<>(), result);
        return result;
    }
    public void subset(int []arr, int c, List<Integer> list, List<List<Integer>> result)
    {
        result.add(new ArrayList<>(list));
        for(int i = c; i < arr.length; i++)
        {
            if(i > c && arr[i-1] == arr[i]) continue;
            list.add(arr[i]);
            subset(arr, i+1, list, result);
            list.removeLast();
        }
    }
}
