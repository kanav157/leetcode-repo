class Solution {
    public int minMoves(int[] nums) {
        int result = 0;
        int minimum = nums[0];
        for (int i = 0 ; i < nums.length ; i ++)
        {
            result = result + nums[i];
            minimum = Math.min(minimum,nums[i]);
        }
        return result - minimum * nums.length;
    }
}