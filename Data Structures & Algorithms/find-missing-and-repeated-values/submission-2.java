class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int []re = new int[2];
        ArrayList<Integer> list = new ArrayList<>(); 
        for(int i = 0; i < grid.length; i++)
        {
            for(int j = 0; j < grid[i].length; j++)
            { 
                list.add(grid[i][j]);
            }
        }  
        Collections.sort(list);
        for(int i = 1; i < list.size();i++)
        {
            if(list.get(i).equals(list.get(i-1)))
            {
                re[0] = list.get(i); 
            }
            else if(list.get(i-1)+1 != list.get(i))
            {
                re[1] = list.get(i-1)+1;
            }
        }
        if(list.get(0) != 1)
        {
            re[1] = 1;
            return re;
        } 
        if(re[1] == 0)
        {
           re[1] = list.get(list.size()-1)+1; 
        }
        return re;
    }
}