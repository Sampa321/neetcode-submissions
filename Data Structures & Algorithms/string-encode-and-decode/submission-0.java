class Solution {

    public String encode(List<String> strs) {
        String re = "";
        for(String str : strs)
        {
            re += str+"-";
        }
        return re;
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        String s ="";
        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if(ch == '-')
            {
                result.add(s);
                s = "";
            }
            else
            {
                s += ch;
            }
        }
        return result;
    }
}
