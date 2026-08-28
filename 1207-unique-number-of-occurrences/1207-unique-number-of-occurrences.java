class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        ArrayList<Integer> a = new ArrayList<>();
        int count = 1;
        ArrayList<Integer> already = new ArrayList<>();

        for (int i = 0 ; i < arr.length ; i++)
        {
            if (already.contains(arr[i]))
            {
                continue;
            }
            for (int j = i+1 ; j < arr.length ; j++)
            {
                if (arr[i] == arr[j])
                {
                    count = count + 1;
                }
            }

            already.add(arr[i]);
            a.add(count);
            count = 1;
        }
        int b = 0;
        for (int i = 0 ; i < a.size() ; i++)
        {
            for (int j = i+1 ; j < a.size() ; j++)
            {
                if (a.get(i).equals(a.get(j)))
                {
                    return false;
                }
            }
        }
        return true;
    }
}