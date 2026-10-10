class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> result = new HashMap<>();
        for (int i = 0 ; i < nums.length ; i++)
        {
            int need = target - nums[i];
            if (result.containsKey(need))
            {
                return new int[]{result.get(need),i};
            }
            result.put(nums[i],i);
        }
        return new int[]{};
    }
}