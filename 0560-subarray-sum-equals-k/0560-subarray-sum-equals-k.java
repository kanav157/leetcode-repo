class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> result = new HashMap<>();
        result.put(0,1);
        int count = 0;
        int sum = 0;
        for (int i = 0 ; i < nums.length ; i++)
        {
            sum = sum + nums[i];
            if (result.containsKey(sum-k))
            {
                count = count + result.get(sum-k);
            }
            if (result.containsKey(sum))
            {
                result.put(sum,result.get(sum)+1);
            }
            else
            {
                result.put(sum,1);
            }
        }
        return count;
    }
}