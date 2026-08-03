class Solution {
    public int scoreOfString(String s) {
        int re = 0;
        for(int i = s.length()-1; i >= 1; i --)
        {
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(i-1);
            int curr = Math.abs(ch1-ch2);
            re += curr;
        }
        return re;
    }
}