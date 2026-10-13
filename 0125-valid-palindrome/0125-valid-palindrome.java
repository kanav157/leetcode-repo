class Solution {
    public boolean isPalindrome(String s) {
        if (s.equals(" "))
        {
            return true;
        }
        s = s.replaceAll("[^a-zA-Z0-9]","");
        s = s.toLowerCase();
        String a = new StringBuilder(s).reverse().toString();
        if ( a.equals(s))
        {
            return true;

        }
        return false;
    }
}