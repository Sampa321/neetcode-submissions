class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int []re = new int[2];
        int i = 0;
        int j = numbers.length-1;
        while(i < j)
        {
            if(numbers[i]+numbers[j] == target)
            {
                re[0] = i+1;
                re[1] = j+1;
                return re;
            }
            else if(numbers[i]+numbers[j] < target)
            {
                i++;
            }
            else
            {
                j--;
            }
        }
        return re;
    }
}
