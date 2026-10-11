class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashSet<Integer> result = new HashSet<>();
        int left = 0 ;
        long max = 0;
        long sum = 0;
        for (int i = 0 ; i < nums.length ; i++)
        {
            while(result.contains(nums[i]))
            {
                sum = sum - nums[left];
                result.remove(nums[left]);
                left++;
            }
            sum += nums[i];
            result.add(nums[i]);

            if (i - left + 1 > k)
            {
                sum = sum - nums[left];
                result.remove(nums[left]);
                left++;
            }

            if (i - left + 1 == k)
            {
                max= Math.max(max,sum);
            }
        }
        return max;
    }
}
