class Solution {
    public int removeDuplicates(int[] nums) {

        int k = 0;
        int[] kanav = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {

            boolean found = false;

            for (int j = 0; j < k; j++) {

                if (nums[i] == kanav[j]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                kanav[k] = nums[i];
                k++;
            }
        }

        for (int i = 0; i < k; i++) {
            nums[i] = kanav[i];
        }

        return k;
    }
}