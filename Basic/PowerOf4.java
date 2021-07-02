class Solution
{
    int isPowerOfFour(long n)
    {
        double d=Math.log(n)/Math.log(4);
        int r=(int)d;
        if(d==r)
        {
            return 1;
        }
        return 0;
    }
}
