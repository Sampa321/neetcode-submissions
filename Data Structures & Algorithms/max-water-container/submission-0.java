class Solution {
    public int maxArea(int[] heights) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        int j = heights.length-1;
        int maximum = 0;
        while(i < j)
        {
            int currMax = Math.min(heights[i], heights[j])*(j-i);
            maximum = Math.max(maximum, currMax);
            if(heights[i] < heights[j])
            {
                i++;
            }
            else
            {
                j--;
            }
        }
        return maximum;
    }
}
