class Solution {
    public String reverseWords(String s) {
        String[] a = s.trim().split("\\s+");
        String result = "";

        for (int i = a.length-1 ; i >= 0 ; i--)
        {
            result = result + a[i] + " ";
        }

        return result.trim();
    }
}