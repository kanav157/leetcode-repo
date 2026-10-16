class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        s = s.replaceAll("[^a-zA-Z0-9]","");
        s = s.toLowerCase();
        int right = s.length() - 1;

        while (right > left)
        {
            if (s.charAt(left) != s.charAt(right))
            {
                return false;
            }
            left++;
            right --;
        }
        return true;
    }
}