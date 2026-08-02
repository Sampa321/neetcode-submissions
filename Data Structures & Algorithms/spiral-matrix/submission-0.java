class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int L = 0;
        int R = matrix[0].length-1;
        int T = 0;
        int B = matrix.length-1;
        while(L <= R && T <= B)
        {
            for(int i = L; i <= R; i++)
            {
                result.add(matrix[T][i]);
            }
            T++;
            for(int i = T; i <= B; i++)
            {
                result.add(matrix[i][R]);
            }
            R--;
            if(T <= B)
            {
                for(int i = R; i >= L; i--)
                {
                  result.add(matrix[B][i]);  
                }
                B--;
            }
            if(L <= R)
            {
                for(int i = B; i >= T; i--)
                {
                    result.add(matrix[i][L]);  
                }
                L++;
            }
        }
        return result;   
    }
}
