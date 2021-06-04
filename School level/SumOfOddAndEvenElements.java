class Solution
{
    public int[] find_sum(int n)
    {
        // Code here
        int even=0;
        int odd=0;
        for(int i=1;i<=n;i+=2)
        {
            odd+=i;
        }
        for(int i=2;i<=n;i+=2)
        {
            even+=i;
        }
        int arr[]={odd,even};
        return arr;
    }
}
