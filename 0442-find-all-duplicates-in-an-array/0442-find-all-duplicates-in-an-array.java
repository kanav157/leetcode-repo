class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        HashSet<Integer> result = new HashSet<>();
        for (int i = 0 ; i < nums.length ; i++)
        {
            if (result.contains(nums[i]))
            {
                ans.add(nums[i]);
            }
            result.add(nums[i]);
        }
        return ans;
    }
}