class Solution {

    public int longestAlternatingSubarray(int[] nums, int threshold) {

        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                count++;
            }
        }

        if (count == nums.length) {
            return 0;
        }

        int i = 0;
        int ans = 0;

        for (int j = 0; j < nums.length; j++) {

            // If current number is greater than threshold,
            // start a new subarray after j
            if (nums[j] > threshold) {
                i = j + 1;
                continue;
            }

            // Move i until we find an even number
            while (i <= j && nums[i] % 2 != 0) {
                i++;
            }

            // If two consecutive numbers have the same parity,
            // start from the current number
            if (j > i && nums[j] % 2 == nums[j - 1] % 2) {
                i = j;
            }

            if (i <= j && nums[i] % 2 == 0) {
                ans = Math.max(ans, j - i + 1);
            }
        }

        return ans;
    }
}