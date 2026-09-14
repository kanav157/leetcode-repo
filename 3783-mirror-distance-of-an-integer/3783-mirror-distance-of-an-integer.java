class Solution {
    public int mirrorDistance(int n) {
        int reverse = 0;
        int or = n;
        while (n != 0 )
        {
            int a = n % 10;
            reverse = reverse * 10 + a;
            n = n / 10;
        }
        int result = reverse - or;
        return Math.abs(result);
    }
}