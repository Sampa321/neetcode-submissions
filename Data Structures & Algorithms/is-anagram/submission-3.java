class Solution {
    public boolean isAnagram(String s, String t) {
        //Approach-1
        // int []freq = new int[26];
        // if(s.length() != t.length()) return false; 
        // for(int i = 0; i < s.length();i++)
        // {
        //     freq[s.charAt(i)-'a']++;
        //     freq[t.charAt(i)-'a']--;
        // }
        // for(int val : freq)
        // {
        //     if(val != 0)
        //     {
        //         return false;
        //     }
        // }
        // return true;

        //Approach-2
        if (s.length() != t.length()) return false;
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a, b);
    }
}
