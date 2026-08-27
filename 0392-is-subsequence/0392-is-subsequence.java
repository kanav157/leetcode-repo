class Solution {
    public boolean isSubsequence(String s, String t) {
        int start = 0;
        int end = t.length();
        for (int i = 0 ; i < s.length() ; i++)
        {
            boolean result = false;

            for (int j = start ; j < end ; j++)
            {
                if (s.charAt(i) == t.charAt(j))
                {
                    result = true;
                    start = j + 1;
                    break;
                }
            }

            if ( !result )
            {
                return false;
            }
        }
        return true;
    }
}