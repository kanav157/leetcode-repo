class Solution {
    public boolean isValid(String s) {
        Stack<Character> result = new Stack<>();

        for (char chars : s.toCharArray())
        {
            if (chars == '(')
            {
                result.push(')');
            }
            else if (chars == '[')
            {
                result.push(']');
            }
            else if (chars == '{')
            {
                result.push('}');
            }
            else
            {
                if (result.isEmpty() || result.pop() != chars)
                {
                    return false;
                }
            }
        }
        return result.isEmpty();
    }
}