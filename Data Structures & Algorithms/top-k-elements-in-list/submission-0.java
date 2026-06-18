class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int []re = new int[k];
        for(int ele : nums)
        {
            map.put(ele,map.getOrDefault(ele, 0)+1);
        }
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a,b)->b.getValue()-a.getValue());
        for(int i = 0; i < k; i++)
        {
            re[i] = list.get(i).getKey();
        }
        return re;
    }
}
