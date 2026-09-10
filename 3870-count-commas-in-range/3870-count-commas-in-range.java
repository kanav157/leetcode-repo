class Solution {
    public int countCommas(int n) {
        int start = 1000;
        int answer = 0;
        int commas = 0;

        while (start <= n)
        {
            int end = Math.min(n,start*1000-1);
            answer = answer + (end - start + 1);
            start = start*1000;
            commas++;
        }
        return answer;
    }
}