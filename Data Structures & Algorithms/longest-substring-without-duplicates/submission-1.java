class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maximum = 0;
        int l = 0;
        HashSet<Character> set = new HashSet<>();
        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            while(set.contains(ch))
            {
                set.remove(s.charAt(l));
                l++;
            } 
            set.add(ch);
            maximum = Math.max(maximum, i-l+1);
        }
        return maximum;
    }
}
