class Solution {
    public String reverseVowels(String s) {
        List<Character> a = new ArrayList<>();
        for (int i=0;i<s.length();i++)
        {
            char c = Character.toLowerCase(s.charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
            {
                a.add(s.charAt(i));
            }
        }
        Collections.reverse(a);

        char[] arr = s.toCharArray();
        int j = 0;
        for (int i = 0 ; i < arr.length ; i++)
        {
            char c = Character.toLowerCase(arr[i]);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
            {
                arr[i] = a.get(j);
                j++;

            }
        }
        return new String(arr);
    }
}