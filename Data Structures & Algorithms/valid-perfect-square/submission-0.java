class Solution {
    public boolean isPerfectSquare(int num) {
        if(num == 1) return true;
        int low = 1;
        int high = num/2;
        while(low <= high)
        {
            int mid = (low+high)/2;
            long product = (long)mid*mid;
            if(product == num) return true;
            else if(product < num) low = mid+1;
            else high = mid-1;
        }
        return false;
    }
}