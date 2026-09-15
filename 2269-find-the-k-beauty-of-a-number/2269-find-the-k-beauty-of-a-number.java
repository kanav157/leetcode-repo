class Solution {
    public int divisorSubstrings(int num, int k) {
        String s = String.valueOf(num);
        int i = 0 ;
        int count = 0;
        for (int j = 0 ; j < s.length() ; j ++)
        {
            if (j-i+1 == k)
            {
                int val = Integer.parseInt(s.substring(i,j+1));
                if ( val != 0 && num % val == 0)
                {
                    count++;
                }
                i++;
            }
        
        }
        return count;
    }
}