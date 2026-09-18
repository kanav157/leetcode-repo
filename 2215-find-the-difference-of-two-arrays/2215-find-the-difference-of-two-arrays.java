class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        List<List<Integer>> result = new ArrayList<>();

        List<Integer> first = new ArrayList<>();
        List<Integer> second = new ArrayList<>();

        // Find elements in nums1 but not nums2
        for (int i = 0; i < nums1.length; i++) {

            boolean found = false;

            for (int j = 0; j < nums2.length; j++) {

                if (nums1[i] == nums2[j]) {
                    found = true;
                    break;
                }
            }

            if (!found && !first.contains(nums1[i])) {
                first.add(nums1[i]);
            }
        }

        // Find elements in nums2 but not nums1
        for (int i = 0; i < nums2.length; i++) {

            boolean found = false;

            for (int j = 0; j < nums1.length; j++) {

                if (nums2[i] == nums1[j]) {
                    found = true;
                    break;
                }
            }

            if (!found && !second.contains(nums2[i])) {
                second.add(nums2[i]);
            }
        }

        result.add(first);
        result.add(second);

        return result;
    }
}