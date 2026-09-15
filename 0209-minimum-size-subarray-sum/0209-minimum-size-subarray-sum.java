class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0 ;
        int mini = Integer.MAX_VALUE; 
        int sum = 0;
        for (int j = 0 ; j < nums.length ; j++)
        {
            sum = sum + nums[j];
            while (sum >= target)
            {
                mini = Math.min(mini,j-i+1);
                sum = sum - nums[i];
                i++;
            }
        }
        return mini == Integer.MAX_VALUE ? 0 : mini;
    }
}