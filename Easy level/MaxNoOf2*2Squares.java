class Solution
{
    public static long numberOfSquares(long base)
    {
        //code here
        base=(base-2)/2;
        return (base*(base+1))/2;
    }
}
