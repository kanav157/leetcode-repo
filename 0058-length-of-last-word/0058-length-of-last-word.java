class Solution {
    public int lengthOfLastWord(String s) {
        String a = s.trim();
        String b[] = a.split(" ");
        String c = b[b.length-1];
        return c.length();
    }
}