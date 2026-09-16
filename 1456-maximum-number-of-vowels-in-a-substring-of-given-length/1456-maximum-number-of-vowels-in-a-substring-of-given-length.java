class Solution {
    public int maxVowels(String s, int k) {
        int i = 0 ;
        int count = 0 ;
        int max = 0;
        for (int j = 0 ; j < s.length(); j++)
        {
            if (isVowel(s.charAt(j)))
            {
                count++;
            }
            while(j - i + 1 > k)
            {
                if (isVowel(s.charAt(i)))
                {

                    count--;
                }

                i++;
                
            }
            if (k == j - i + 1)
            {
                max = Math.max(count,max);
            }
        }
        return max;
    }
        public boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}