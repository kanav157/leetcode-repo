class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxarea = 0 ;

        while (left < right)
        {
            int width = right - left ; 
            int currentArea  = width * Math.min(height[right], height[left]);

            maxarea = Math.max(currentArea, maxarea);

            if (height[left] < height[right])
            {
                left +=1;
            }
            else
            {
                right--;
            }
        }
        return maxarea;
    }
}