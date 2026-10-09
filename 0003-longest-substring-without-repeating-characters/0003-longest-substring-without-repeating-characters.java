import java.util.HashSet;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> result = new HashSet<>();
        int left = 0;
        int max = 0;
        for (int i = 0 ; i < s.length() ; i++)
        {
            while (result.contains(s.charAt(i)))
            {
                result.remove(s.charAt(left));
                left++;
            }
            result.add(s.charAt(i));
            max = Math.max(max,i-left+1);
        }
        return max;
    }
}