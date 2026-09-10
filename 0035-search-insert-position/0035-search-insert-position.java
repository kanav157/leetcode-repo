class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right)
        {
            int i = (left + right ) / 2;

            if (nums[i] == target)
            {
                return i;
            }
            else
            {
                if (target > nums[nums.length - 1])
                {
                    return nums.length;
                }
                else if (target < nums[0])
                {
                    return 0;
                }
                else if (target > nums[i])
                {
                    left = i + 1;
                }
                else if (target < nums[i])
                {
                    right = i - 1;
                }
            }
        }
        return left;
    }
}