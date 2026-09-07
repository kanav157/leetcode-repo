class Solution {
    public boolean isPalindrome(int x) {
        if (x<0)
        {
            return false;
        }
        String a = Integer.toString(x);
        String b = "";
        for (int i = a.length() - 1 ; i >= 0 ; i--)
        {
            b = b + a.charAt(i);
        }

        if (a.equals(b))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}