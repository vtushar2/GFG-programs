class Solution
{
    public long sumofproduct(int n)
    {
        // code here
        int x,y, sum=0;
        for(x=1;x<=n;x++)
        {
            y=n/x;
            sum+=x*y;
        }
        return sum;
    }
}
