class Solution {
    public int countCommas(int n) {
        int start = 1000;
        int answer = 0;
        int commas = 1;

        while (start <= n)
        {
            int end = Math.min(n,start*1000-1);
            answer = answer + (end - start + 1)*commas;
            start = start * 1000;
            commas ++;
        }
        return answer;
    }
}