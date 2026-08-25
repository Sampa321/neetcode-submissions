class Solution {
    public int[] sortArray(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int []re = new int[nums.length];
        for(int num : nums)
        {
            pq.add(num);
        }
        int idx = 0;
        while(!pq.isEmpty())
        {
            re[idx++] = pq.poll();
        }
        return re;
    }
}