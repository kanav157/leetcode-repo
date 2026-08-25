class Solution {
    public String mergeAlternately(String word1, String word2) {
        String a = "";
        for (int i = 0 ;i<word1.length();i++)
        {
            for (int j = i; j<word2.length();j++)
            {
                a = a + word1.charAt(i) + word2.charAt(j);
                break;
            }
        }

        if (word2.length() > word1.length())
        {
            for (int i = word1.length() ; i< word2.length(); i++)
            {
                a = a + word2.charAt(i);
            }
        }
        if (word1.length() > word2.length())
        {
            for (int i = word2.length() ; i < word1.length(); i++)
            {
                a = a + word1.charAt(i);
            }
        }
        return a;
    }
}