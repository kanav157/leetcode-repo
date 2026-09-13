class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> result = new HashSet<>();
        for (int j = 0 ; j < nums.length ; j++)
        {
            if (result.contains(nums[j]))
            {

                return true;
            }
            result.add(nums[j]);

            if (result.size() > k)
            {
                result.remove(nums[j-k]);
            }
        }
        return false;
    }
}