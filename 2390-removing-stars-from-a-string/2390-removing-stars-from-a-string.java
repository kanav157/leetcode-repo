class Solution {
    public String removeStars(String s) {
        Stack<Character> result = new Stack<>();
        for (int i  = 0 ; i < s.length() ; i++)
        {
            if (s.charAt(i) == '*')
            {
                result.pop();
            }
            else
            {

                result.push(s.charAt(i));
            }
            
        }
        String a = "";
        for (char c : result)
        {
            a = a + c;
        }
        return a;
    }
}