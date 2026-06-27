class Solution {
    public boolean isHappy(int n) {
       HashSet<Integer> set = new HashSet<>();
       while(!set.contains(n))
       {
           set.add(n);
           int square = 0;
           while(n != 0)
           {
             square += (n%10)*(n%10);
             n /= 10;
           }
           if(square == 1) return true;
           n = square;
       } 
       return false;
    }
}
