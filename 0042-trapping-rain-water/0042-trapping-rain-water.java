class Solution
{
    public int trap(int[] height)
    {
        int area=0;
        int maxleft=-1;
        int maxright=-1;
        int n=height.length;
        int[] left = new int[n];
        int[] right = new int[n];
        for(int i=0;i<n;i++)
        {
            if(maxleft<height[i])
                maxleft=height[i];
            left[i]=maxleft;
        }
        for(int i=n-1;i>=0;i--)
        {
            if(maxright<height[i])
                maxright=height[i];
            right[i]=maxright;
        }
        for(int i=0;i<n;i++)
        {
            area=area+Math.min(left[i],right[i])-height[i];
        }
        return area;
    }
}