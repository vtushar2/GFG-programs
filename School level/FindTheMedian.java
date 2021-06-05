class Solution
{
    public int find_fact(int[] v)
    {
        // Code here
        int n=v.length;
        int mid=(int)n/2;
        Arrays.sort(v);
        if(n%2==0)
        {
            return (v[mid]+v[mid-1])/2;
        }
        return v[mid];
    }
}
