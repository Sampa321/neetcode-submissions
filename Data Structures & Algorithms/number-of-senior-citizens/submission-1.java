class Solution {
    public int countSeniors(String[] details) { 
        int c = 0;
        for(int i = 0; i < details.length; i++)
        {
            String subStr = details[i].substring(11, 13);
            if(Integer.parseInt(subStr) > 60) c++;
        }
        return c;
    }
}