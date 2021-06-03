class Solution
{
    public long reverse_digit(long n)
    {
        // Code here
        long sum=0;
        long r=0;
        while(n>0)
        {
            r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        return sum;
    }
}
