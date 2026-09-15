class Solution {
    public int maximumLengthSubstring(String s) {
        int i = 0 ;
        int result = 0 ;
        HashMap<Character,Integer> map = new HashMap<>();
        for (int j = 0 ; j < s.length() ; j++)
        {
            char c = s.charAt(j);
            map.put(c,map.getOrDefault(c,0)+1);

            while (map.get(c) > 2)
            {
                char b = s.charAt(i);
                map.put(b,map.get(b)-1);
                i++;

            }
            result = Math.max(result,j-i+1);
        }
        return result;
    }
}