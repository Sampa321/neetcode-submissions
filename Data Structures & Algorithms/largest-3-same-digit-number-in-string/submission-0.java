class Solution {
    
    public String largestGoodInteger(String num) { 
        int maximum = Integer.MIN_VALUE;
        for(int i = 0; i < num.length()-2; i++)
        {
            if(num.charAt(i) == num.charAt(i+1) && num.charAt(i) == num.charAt(i+2))
            {
                maximum = Math.max(maximum, num.charAt(i)-'0');
            }
        }
        if(maximum != Integer.MIN_VALUE)
        {
            return String.valueOf(maximum).repeat(3);
        }
        return "";
    }
}