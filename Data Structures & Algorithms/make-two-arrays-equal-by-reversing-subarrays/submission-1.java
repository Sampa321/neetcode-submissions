class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int []count = new int[1001];
        for(int x : target)
        {
            count[x]++;
        }
        for(int x : arr)
        {
            count[x]--;
        }

        for(int x : count)
        {
            if(x != 0) return false;
        }
        return true;
    }
}
