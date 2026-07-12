class KthLargest {
    List<Integer> list;
    int k;
    public KthLargest(int k, int[] nums) {
        this.k = k;
        list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++)
        {
            list.add(nums[i]);
        }
    }
    
    public int add(int val) {
        list.add(val);
        Collections.sort(list);
        return list.get(list.size()-k);
    }
}
