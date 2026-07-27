class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int i = s.length()-1;
        int c = 0;
        while(i != -1 && s.charAt(i) != ' ')
        {
            c++;
            i--;
        }
        return c;
    }
}