class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>(); 
        for(String token : tokens)
        {
            if(token.equals("/") || token.equals("*") || token.equals("+") || token.equals("-"))
            {
                int right = st.pop();
                int left = st.pop();
                int result = 0;
                switch(token)
                {
                    case "/":
                        result = left / right;
                        break;
                    case "*":
                        result = left * right;
                        break;
                    case "+":
                        result = left + right;
                        break;
                    case "-":
                        result = left - right;
                        break;    
                }
                st.push(result);
            }
            else
            {
                st.push(Integer.valueOf(token));
            }
        }
        return st.pop();
    }
}
