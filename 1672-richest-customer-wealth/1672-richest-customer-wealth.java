class Solution
{
    public int maximumWealth(int[][] accounts)
    {
        int max_wealth=0;
        for(int[] i : accounts)
        {
            int sum=0;
            for(int money : i)
                sum=sum+money;
            max_wealth=Math.max(max_wealth,sum);
        }
        return max_wealth;
    }
}