class Solution
{
    public long sum_of_square_oddNumbers(long n)
    {
        // Code here
        long sum=0;
        long mul=1;
        for(int i=1;i<=(n*2);i+=2)
        {
            mul=i*i;
            sum+=mul;
        }
        return sum;
    }
}
