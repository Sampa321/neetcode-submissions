class Solution {
    public boolean matches(int []arr1, int []arr2)
    {
        for(int i = 0; i < 26; i++)
        {
            if(arr1[i] != arr2[i]) return false;
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        int []arr1 = new int[26];
        int []arr2 = new int[26];
        if(s1.length() > s2.length()) return false;
        for(int i = 0; i < s1.length(); i++)
        {
            char ch = s1.charAt(i);
            arr1[ch-'a']++;
        }
        int windowSize = s1.length();
        for(int i = 0; i < s2.length(); i++)
        {
            char ch = s2.charAt(i);
            arr2[ch-'a']++;
            if(i >= windowSize)
            {
                arr2[s2.charAt(i-windowSize)-'a']--;
            }
            if(matches(arr1, arr2)) return true;
        }
        return false;
    }
}
