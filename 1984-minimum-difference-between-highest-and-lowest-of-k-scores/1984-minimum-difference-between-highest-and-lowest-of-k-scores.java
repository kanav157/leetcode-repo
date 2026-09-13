class Solution {
    public int minimumDifference(int[] nums, int k) {
        int ans = Integer.MAX_VALUE;
        if (nums.length == 1)
        {
            return 0;
        }
        Arrays.sort(nums);
        int i = 0 ;
        for (int j = 0 ; j < nums.length ; j++)
        {
            while (j - i + 1 > k)
            {
                i++;
            }
            if (j-i+1 == k)
            {
                ans = Math.min(ans,nums[j]-nums[i]);
            }
        }
        return ans;
    }
}