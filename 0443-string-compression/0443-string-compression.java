class Solution {
    public int compress(char[] chars) {
        ArrayList<Character> a = new ArrayList<>();
        int count = 1;

        for (int i = 0; i < chars.length; i++) {
            if (i < chars.length - 1 && chars[i] == chars[i + 1]) {
                count++;
            } else {
                a.add(chars[i]);
                if (count > 1) {
                    String c = "" + count;
                    for (int j = 0; j < c.length(); j++) {
                        a.add(c.charAt(j));
                    }
                }
                count = 1;
            }
        }

        for (int i = 0; i < a.size(); i++) {
            chars[i] = a.get(i);
        }

        return a.size();
    }
}