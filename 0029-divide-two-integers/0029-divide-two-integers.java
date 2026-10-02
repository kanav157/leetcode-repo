class Solution {
    public int divide(int dividend, int divisor) {

        long a = dividend;
        long b = divisor;

        boolean negative = (a < 0) ^ (b < 0);

        a = Math.abs(a);
        b = Math.abs(b);

        long count = 0;

        while (a >= b) {

            long temp = b;
            long multiple = 1;

            while (a >= (temp << 1)) {
                temp = temp << 1;
                multiple = multiple << 1;
            }

            a = a - temp;
            count = count + multiple;
        }

        if (negative) {
            count = -count;
        }

        if (count > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }

        return (int) count;
    }
}