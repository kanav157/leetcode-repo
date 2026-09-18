class Solution {
    public int largestAltitude(int[] gain) {
        ArrayList<Integer> result = new ArrayList<>();
        result.add(0);
        int sum = gain[0];
        result.add(sum);
        for (int i = 1 ; i < gain.length ; i++)
        {
            sum = sum + gain[i];
            result.add(sum);
        }
        int max = Collections.max(result);
        return max;
    }
}