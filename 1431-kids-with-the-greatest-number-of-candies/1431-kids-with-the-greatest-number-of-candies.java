class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        boolean a = false;
        int max = candies[0];
        for (int i = 1; i < candies.length;i++)
        {
            if (max < candies[i])
            {
                max = candies[i];
            }
        }
        for (int i = 0 ; i < candies.length;i++)
        {
            if (candies[i]+extraCandies >= max)
            {
                a = true;
                list.add(a);
            }
            else
            {
                list.add(false);
            }
        }
        return list;
    }
}