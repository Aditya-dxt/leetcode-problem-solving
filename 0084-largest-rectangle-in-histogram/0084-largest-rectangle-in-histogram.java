class Solution
{
    public int largestRectangleArea(int[] heights)
    {
        int n=heights.length;
        int leftMin[]=new int[n];
        for(int i=0;i<n;i++)
        {
            leftMin[i]=i-1;
            while(leftMin[i]!=-1 && heights[leftMin[i]]>=heights[i])
                leftMin[i]=leftMin[leftMin[i]];
        }
        int rightMin[]=new int[n];
        for(int i=n-1;i>=0;i--)
        {
            rightMin[i]=i+1;
            while(rightMin[i]!=n && heights[rightMin[i]]>=heights[i])
                rightMin[i]=rightMin[rightMin[i]];
        }
        int area=0;
        for(int i=0;i<n;i++)
        {
            int length=heights[i];
            int breadth=rightMin[i]-leftMin[i]-1;
            area=Math.max(area,length*breadth);
        }
        return area;
    }
}