class Solution {
    public int[] replaceElements(int[] arr) {
       int greater = -1;
       int []re = new int[arr.length];

       for(int i = arr.length-1; i >= 0; i--)
       {
         re[i] = greater;
         greater = Math.max(greater, arr[i]);
       } 
       return re;
    }
}