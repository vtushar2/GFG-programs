class GFG 
{ 
    // Returns sum of longest 
    // increasing subarray. 
    static int largestSum(int arr[], int N) 
    {
        int sum=arr[0];
        int max=arr[0];
        for(int i=1;i<N;i++)
        {
            if(arr[i]>arr[i-1])
            {
                sum+=arr[i];
            }
            else
            {
                sum=arr[i];
            }
            if(sum>max)
            {
                max=sum;
            }
        }
        return max;
    }
}
