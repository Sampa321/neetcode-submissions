class Solution {
    public boolean isAnagram(String s, String t) {
        // int firstSum = 0;
        // for(int i = 0; i < s.length();i++)
        // {
        //     char ch = s.charAt(i);
        //     firstSum += ch -'0'; 
        // }
        // int secondSum = 0;
        // for(int i = 0; i < t.length();i++)
        // {
        //     char ch = t.charAt(i);
        //     secondSum += ch -'0'; 
        // }
        // if(firstSum == secondSum) return true;
        // return false;

        if(s.length() != t.length()) return false;
        char []char1 = new char[s.length()];
        for(int i = 0; i < s.length(); i++)
        {
            char1[i] = s.charAt(i);
        }
        Arrays.sort(char1);
        char []char2 = new char[t.length()];
        for(int i = 0; i < t.length(); i++)
        {
            char2[i] = t.charAt(i);
        }
        Arrays.sort(char2);
        for(int i = 0; i < char1.length; i++)
        {
            if(char1[i] != char2[i])
            {
                return false;
            }
        }
        return true;
    }
}
