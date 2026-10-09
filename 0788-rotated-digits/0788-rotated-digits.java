class Solution {
    public int rotatedDigits(int n) {
        int count = 0;
        for (int i = 1 ; i <= n ; i++)
        {
            boolean value = true;
            boolean b = false;
            int num = i;
            while (num > 0)
            {
                int digits = num%10;
                if ( digits == 3 || digits == 4 || digits == 7)
                {
                    value = false;
                    break;
                }
                if ( digits == 2 || digits == 5 || digits == 6 || digits == 9)
                {
                    b = true;
                }

                num = num / 10;

            }

            if ( value && b)
            {
                count ++;
            }
        }
        return count;
    }
}