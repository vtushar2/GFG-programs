class Solution
{
    public int distance(int x1, int y1, int x2, int y2)
    {
        // Code here
        double d1=Math.pow((x2-x1),2);
        double d2=Math.pow((y2-y1),2);
        double d=Math.sqrt(d1+d2);
        return (int)Math.round(d);
    }
}
