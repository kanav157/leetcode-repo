class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] a = new int[nums.length];
        int prod = 1;
        int zero = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                zero++;
            else
                prod = prod * nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            if (zero > 1)
                a[i] = 0;
            else if (zero == 1)
                a[i] = nums[i] == 0 ? prod : 0;
            else
                a[i] = prod / nums[i];
        }

        return a;
    }
}