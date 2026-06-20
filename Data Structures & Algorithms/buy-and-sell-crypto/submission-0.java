class Solution {
    public int maxProfit(int[] prices) {
        ArrayList<Integer> nextGreater = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for(int i = prices.length-1; i >= 0; i--)
        {
            if(prices[i] < max)
            {
                nextGreater.add(max);
            }
            else
            {
                nextGreater.add(-1);
                max = prices[i];
            }
        }
        Collections.reverse(nextGreater);
        int maxProfit = 0;
        for(int i = 0;i < nextGreater.size(); i++)
        {
            if(nextGreater.get(i) != -1)
            {
                maxProfit = Math.max(nextGreater.get(i) - prices[i], maxProfit);
            }
        }
        return maxProfit;
    }
}
