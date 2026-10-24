class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String first = "";
        String last = "";
        for(String word : word1)
        {
            first += word;
        }
        for(String word : word2)
        {
            last += word;
        }

        return first.equals(last);
    }
}
