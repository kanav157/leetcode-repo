class Solution {
    public int reverse(int x) {

        long a = 0;

        while (x != 0) {
            int d = x % 10;
            x = x / 10;

            a = a * 10 + d;
        }

        if (a > 2147483647 || a < -2147483648) {
            return 0;
        }

        return (int)a;
    }
}