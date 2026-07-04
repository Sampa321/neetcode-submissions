class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < nums1.length; i++)
        {
            list.add(nums1[i]);
        } 
        for(int i = 0 ; i < nums2.length; i++)
        {
            list.add(nums2[i]);
        } 
        Collections.sort(list);
        if(list.size() % 2 == 0)
        {
            double sum = (double)(list.get((list.size()/2)-1))+(double)(list.get(list.size()/2));
            return (sum/2);
        }
        else
        {
            return (double)(list.get(list.size()/2));
        }
    }
}
