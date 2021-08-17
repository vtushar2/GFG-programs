class Solution{
    public:
    int longest(int arr[],int n)
    {
        // Write your code here
        int c=1;
        int max=arr[0];
        for(int i=1;i<n;i++)
        {
            if(arr[i]>=max)
            {
                c++;
                max=arr[i];
            }
        }
        return c;
    }
};
