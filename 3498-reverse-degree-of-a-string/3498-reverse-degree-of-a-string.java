class Solution {
    public int reverseDegree(String s) {
        int sum = 0;
        for(int i = 0 ; i<s.length();i++)
        {
            char c = s.charAt(i);
            int r = 'z'- c + 1;

            int pro = i + 1;

            sum = sum + r * pro;
        }
        return sum;
    }
}