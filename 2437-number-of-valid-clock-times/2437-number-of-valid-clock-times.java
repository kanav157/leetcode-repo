class Solution {
    public int countTime(String time) {
        int hours = 1;
        int minutes = 1;

        // Count valid hour possibilities
        if (time.charAt(0) == '?' && time.charAt(1) == '?') {
            hours = 24;
        } else if (time.charAt(0) == '?') {
            hours = (time.charAt(1) <= '3') ? 3 : 2;
        } else if (time.charAt(1) == '?') {
            hours = (time.charAt(0) == '2') ? 4 : 10;
        }

        // Count minute possibilities
        if (time.charAt(3) == '?') {
            minutes = 6;
        }

        if (time.charAt(4) == '?') {
            minutes *= 10;
        }

        return hours * minutes;
    }
}