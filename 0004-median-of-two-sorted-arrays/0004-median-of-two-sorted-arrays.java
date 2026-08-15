class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int total = nums1.length + nums2.length;
        int len1 = nums1.length;

        int[] nums3 = new int[total];

        // Copy nums1
        for (int i = 0; i < nums1.length; i++) {
            nums3[i] = nums1[i];
        }

        // Copy nums2
        for (int j = 0; j < nums2.length; j++) {
            nums3[len1 + j] = nums2[j];
        }

        // Sort
        Arrays.sort(nums3);

        int len3 = nums3.length;

        // Odd length
        if (len3 % 2 != 0) {
            int index = len3 / 2;
            return nums3[index];
        }

        // Even length
        else {
            int index1 = len3 / 2;
            int index2 = index1 - 1;

            return (nums3[index1] + nums3[index2]) / 2.0;
        }
    }
}