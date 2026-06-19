class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder curr = new StringBuilder();
        for(int i = 0 ; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch))
            {
                curr.append(ch);
            }
        }
         
        return (curr.toString().equals(curr.reverse().toString()));
    }
}
