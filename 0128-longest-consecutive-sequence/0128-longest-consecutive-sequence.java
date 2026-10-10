class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> result = new HashSet<>();
        for (int i = 0 ; i < nums.length ; i++)
        {
            result.add(nums[i]);
        }
        int longest = 0;
        for (int num : result)
        {
            if (!result.contains(num-1))
            {
                int current = num;
                int count = 0;

                while (result.contains(current))
                {
                    current++;
                    count++;
                }
                longest = Math.max(longest,count);
            }
            
        }
        return longest;
    }
}