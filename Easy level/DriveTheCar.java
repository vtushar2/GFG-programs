class Solution {

    public static long required(long a[], long n, long k) {
        // Your code goes here
        long max=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        if(k>=max)
        {
            return -1;
        }
        else
        {
            return max-k;
        }
    }
}
