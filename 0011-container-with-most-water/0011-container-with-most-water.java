class Solution {
    public int maxArea(int[] height) {
        int left = 0 ;
        int result = 0;
        int right = height.length-1;
        while (left < right)
        {
            int width = right - left;
            result = Math.max(result,width*Math.min(height[left],height[right]));

            if (height[left] < height[right])
            {
                left+=1;
            }
            else
            {
                right --;
            }
        }
        return result;
    }
}