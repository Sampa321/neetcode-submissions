class Solution {
    public int trap(int[] height) {
        ArrayList<Integer> nextLargest = new ArrayList<>();
        ArrayList<Integer> prevLargest = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for(int i = height.length-1; i >= 0; i--)
        {
            if(height[i] <= max)
            {
                nextLargest.add(max);
            }
            else
            {
                nextLargest.add(-1);
                max = height[i];
            }
        }
        Collections.reverse(nextLargest);
        max = Integer.MIN_VALUE;
        for(int i = 0; i < height.length; i++)
        {
            if(max >= height[i])
            {
                prevLargest.add(max);
            }
            else
            {
                prevLargest.add(-1);
                max = height[i];
            }
        }
        int sum = 0;
        for(int i = 0; i < height.length; i++)
        {
            if(nextLargest.get(i) != -1 && prevLargest.get(i) != -1)
            {
                int maximum = Math.min(nextLargest.get(i),prevLargest.get(i));
                sum += (maximum - height[i]);
            }
        }
        return sum;
    }
}
