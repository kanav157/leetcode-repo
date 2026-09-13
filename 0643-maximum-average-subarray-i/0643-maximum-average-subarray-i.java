class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i = 0 ;
        double av = Double.NEGATIVE_INFINITY;
        int count = 0;
        for (int j = 0 ; j < nums.length ; j++)
        {
            count = count + nums[j];
            while (j - i + 1 > k)
            {
                count = count - nums[i];
                i ++;
            }

            if (j - i + 1 == k)
            {
                av = Math.max(av, (double)count/k);
            }
        }
        return av;
    }
}