class Solution {
    public int strStr(String haystack, String needle) {
       int n = haystack.length(), m = needle.length();
       for(int i = 0;i < n-m+1; i++)
       {
            String search = haystack.substring(i, i+m);
            if(needle.equals(search)) return i;
       }
        return -1;
    }
}