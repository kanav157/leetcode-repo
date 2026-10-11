
class Solution {
    public int convertTime(String current, String correct) {
        String[] parts = current.split(":");
        String[] correctparts = correct.split(":");

        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[1]);
        int partstime = a * 60 + b;

        int a1 = Integer.parseInt(correctparts[0]);
        int b1 = Integer.parseInt(correctparts[1]);
        int correcttime = a1 * 60 + b1;

        int count = 0;

        while (correcttime > partstime) {
            int diff = correcttime - partstime;

            if (diff >= 60) {
                partstime += 60;
            } else if (diff >= 15) {
                partstime += 15;
            } else if (diff >= 5) {
                partstime += 5;
            } else {
                partstime += 1;
            }

            count++;
        }

        return count;
    }
}
