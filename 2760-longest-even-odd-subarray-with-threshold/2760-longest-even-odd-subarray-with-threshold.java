class Solution { 
 
    public int longestAlternatingSubarray(int[] nums, int threshold) { 
 
        int count = 0; 
 
        for (int i = 0; i < nums.length; i++) { 
            if (nums[i] % 2 != 0) { 
                count++; 
            } 
        } 
 
        if (count == nums.length) { 
            return 0; 
        } 
 
        int i = 0; 
        int ans = 0; 
 
        for (int j = 0; j < nums.length; j++) { 

            if (nums[j] > threshold) {
                i = j + 1;
                continue;
            }
 
            while (i <= j && nums[i] % 2 != 0) { 
                i++; 
            } 
 
            if (j > i && nums[j] % 2 == nums[j - 1] % 2) { 
                i = j; 
            } 
 
            if (i <= j && nums[i] % 2 == 0) { 
                ans = Math.max(ans, j - i + 1); 
            } 
        } 
 
        return ans; 
    } 
}