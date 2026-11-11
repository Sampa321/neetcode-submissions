class Solution {
    public String addSpaces(String s, int[] spaces) {
StringBuilder answer=new StringBuilder(s.length()+spaces.length);int j=0;for(int i=0;i<s.length();i++){if(j<spaces.length&&spaces[j]==i){answer.append(' ');j++;}answer.append(s.charAt(i));}return answer.toString();
    }
}
