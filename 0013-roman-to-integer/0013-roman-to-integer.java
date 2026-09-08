class Solution {
    public int romanToInt(String s) {
        int a = 0 ;
        for (int i = 0 ; i < s.length() ; i++)
        {
            if (i+1 < s.length() && s.substring(i,i+2).equals("CM"))
            {
                a = a + 900;
                i++;
            }
            else if (i + 1 < s.length() && s.substring(i,i+2).equals("CD"))
            {
                a = a + 400;
                i++;
            }
            else if (i + 1 < s.length() && s.substring(i,i+2).equals("XC"))
            {
                a = a + 90;
                i++;
            }

            else if (i + 1 < s.length() && s.substring(i,i+2).equals("XL"))
            {
                a = a + 40;
                i++;
            }
            else if (i + 1 < s.length() && s.substring(i,i+2).equals("IX"))
            {
                a = a + 9;
                i++;
            }
            else if (i + 1 < s.length() && s.substring(i,i+2).equals("IV"))
            {
                a = a + 4;
                i++;
            }
            else if ( s.charAt(i) == 'I')
            {
                a = a + 1;
            }
            else if ( s.charAt(i) == 'L')
            {
                a = a + 50;
            }
            else if (s.charAt(i) == 'V')
            {
                a = a + 5;
            }
            else if (s.charAt(i) == 'M')
            {
                a = a + 1000;
            }
            else if (s.charAt(i) == 'D')
            {
                a = a + 500;
            }
            else if (s.charAt(i) == 'C')
            {
                a = a + 100;
            }
            else if (s.charAt(i) == 'X')
            {
                a = a + 10;
            }


        }
        return a;
    }
}