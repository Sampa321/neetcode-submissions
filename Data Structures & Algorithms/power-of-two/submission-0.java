class Solution {
    public boolean isPowerOfTwo(int n) {
        int power = 0;
        while(true)
        {
            if(Math.pow(2, power) == n) return true;
            if(Math.pow(2, power) > n) return false;
            power++;
        }
    }
}