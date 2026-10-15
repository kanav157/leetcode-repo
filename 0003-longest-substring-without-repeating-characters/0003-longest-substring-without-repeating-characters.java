import java.util.HashSet;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> result = new HashSet<>();
        int max = 0;
        int left = 0;
        for (int right = 0 ; right < s.length(); right++)
        {
            while (result.contains(s.charAt(right)))
            {
                result.remove(s.charAt(left));
                left++;
            }
            result.add(s.charAt(right));
            max = Math.max(max,right-left+1);
            

        }
        return max;
    }
}