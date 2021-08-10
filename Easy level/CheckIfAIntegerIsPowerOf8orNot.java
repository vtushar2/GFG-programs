class Solution
{
    public String is_power_of_eight(Long n)
    {
        // Code here
        for(int i=0;i<100;i++)
        {
            if(Math.pow(8,i)==n)
            {
                return "Yes";
            }
        }
        return "No";
    }
}
