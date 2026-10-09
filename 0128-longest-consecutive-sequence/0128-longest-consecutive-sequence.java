class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> result = new HashSet<>();

        for (int num : nums) {
            result.add(num);
        }

        int longest = 0;

        for (int num : result) {
            if (!result.contains(num - 1)) {
                int current = num;
                int count = 1;

                while (result.contains(current + 1)) {
                    current++;
                    count++;
                }

                longest = Math.max(longest, count);
            }
        }

        return longest;
    }
}