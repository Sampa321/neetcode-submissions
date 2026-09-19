class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        ArrayList<Character> list = new ArrayList<>();
        for(int i = 0; i < allowed.length(); i++)
        {
            char ch = allowed.charAt(i);
            list.add(ch);
        }
        int c = 0;
        for(int i = 0; i < words.length; i++)
        {
            boolean flag = true;
            for(int j = 0; j < words[i].length(); j++)
            {
                char ch = words[i].charAt(j);
                if(list.indexOf(ch) == -1)
                {
                    flag = false;
                    break;
                }
            }
            if(flag) c++;
        }
        return c;
    }
}