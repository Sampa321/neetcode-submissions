class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> re = new ArrayList<>();
        int i = 0;
        int j = 0;
        while(i < nums1.length && j < nums2.length)
        {
            if(nums1[i] == nums2[j])
            {
                if(re.indexOf(nums1[i]) == -1)
                {
                    re.add(nums1[i]);
                }
                i++;
                j++;
            }
            else if(nums1[i] < nums2[j])
            {
               i++;
            }
            else
            {
                j++;
            }
        }
        int []result = new int[re.size()];
        for(int k = 0; k < re.size();k++)
        {
            result[k] = re.get(k);
        }
        return result;
    }
}