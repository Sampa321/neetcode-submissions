class Solution {
    public boolean isAnagram(String s, String t) {
        int []freq = new int[26];
        if(s.length() != t.length()) return false; 
        for(int i = 0; i < s.length();i++)
        {
            freq[s.charAt(i)-'a']++;
            freq[t.charAt(i)-'a']--;
        }
        for(int val : freq)
        {
            if(val != 0)
            {
                return false;
            }
        }
        return true;

        // if(s.length() != t.length()) return false;
        // char []char1 = new char[s.length()];
        // for(int i = 0; i < s.length(); i++)
        // {
        //     char1[i] = s.charAt(i);
        // }
        // Arrays.sort(char1);
        // char []char2 = new char[t.length()];
        // for(int i = 0; i < t.length(); i++)
        // {
        //     char2[i] = t.charAt(i);
        // }
        // Arrays.sort(char2);
        // for(int i = 0; i < char1.length; i++)
        // {
        //     if(char1[i] != char2[i])
        //     {
        //         return false;
        //     }
        // }
        // return true;
    }
}
