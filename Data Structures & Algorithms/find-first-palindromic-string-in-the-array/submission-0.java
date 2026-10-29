class Solution {
    public String firstPalindrome(String[] words) {
        for(String word : words)
        {
            String temp = word;
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < temp.length(); i++)
            {
                sb.append(temp.charAt(i));
            }
            if(word.equals(sb.reverse().toString())) 
            {
                return word;
            }
        }
        return "";
    }
}
