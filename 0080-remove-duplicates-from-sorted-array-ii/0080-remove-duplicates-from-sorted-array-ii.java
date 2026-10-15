class Solution {
    public int removeDuplicates(int[] nums) {
        HashMap<Integer,Integer> result = new HashMap<>();
        int left = 0;
        for (int i = 0 ; i < nums.length ; i++)
        {

            if (!result.containsKey(nums[i]))
            {
                result.put(nums[i],1);
                nums[left] = nums[i];
                left++;
            }
            else if (result.get(nums[i]) < 2)
            {
                result.put(nums[i],result.get(nums[i]) + 1);
                nums[left] = nums[i];
                left++;
            }


        }
        return left;
    }
}