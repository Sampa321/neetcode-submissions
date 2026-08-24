class Solution {
    public String kthDistinct(String[] arr, int k) {
        String result = "";
        HashMap<String, Integer> map = new HashMap<>();
        for(String ele : arr)
        {
            map.put(ele, map.getOrDefault(ele, 0)+1);
        }

        int c = 0;
        for(String ele : arr)
        {
            if(map.get(ele) == 1)
            {
                c++;
                if(c == k) return ele;
            }
        }
        return "";
    }
}