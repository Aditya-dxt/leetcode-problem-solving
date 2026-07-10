class Solution
{
    public int trap(int[] height)
    {
        int n=height.length;
        int area=0;
        int left=0;
        int right=n-1;
        int leftMax=height[0];
        int rightMax=height[n-1];
        while(left<right)
        {
            if(leftMax<rightMax)
            {
                left++;
                leftMax=Math.max(leftMax,height[left]);
                area=area+(leftMax-height[left]);
            }
            else
            {
                right--;
                rightMax=Math.max(rightMax,height[right]);
                area=area+(rightMax-height[right]);
            }
        }
    return area;
    }
}