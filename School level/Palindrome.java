class Solution
{
    public String is_palindrome(int n)
    {
        // Code here
        int temp=n;
        int sum=0;
        int r=0;
        while(n>0)
        {
            r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        if(sum==temp)
        {
            return "Yes";
        }
        else
        {
            return "No";
        }
    }
}
