class Solution {
    public boolean isValid(String s) {
        Stack<Character> result = new Stack<>();
        char[] chars = s.toCharArray();

        for (int i = 0 ; i < chars.length ; i++)
        {
            if (chars[i] == '(')
            {
                result.push(')');
            }
            else if (chars[i] == '[')
            {
                result.push(']');
            }
            else if (chars[i] == '{')
            {
                result.push('}');
            }
            else
            {
                if (result.isEmpty() || result.pop() != chars[i])
                {
                    return false;
                }
            }
        }
        return result.isEmpty();
    }
}