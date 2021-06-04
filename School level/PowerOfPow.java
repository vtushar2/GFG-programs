class Solution
{
    public long sum_of_square_evenNumbers(long n)
    {
        // Code here
        long mul=1;
        long sum=0;
        for(int i=2;i<=(n*2);i+=2)
        {
            mul=i*i;
            sum+=mul;
        }
        return sum;
    }
}
