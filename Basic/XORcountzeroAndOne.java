class Solution
{
    public int find_xor(int n)
    {
        // Code here
        int x=0;
        for(int i=1;i<=n;i=i<<1)
        {
            if((i&n)==0)
            {
                x++;
            }
        }
        return(Integer.bitCount(n)^x);
    }
}
