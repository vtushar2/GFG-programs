class Solution {
    int numOfsubarrays(int[] arr, int n) {
        // code here
        int res=0;
        for(int i=0;i<n;i++)
        {
            int sum=arr[i];
            int pro=arr[i];
            for(int j=i+1;j<n;j++)
            {
                if(sum==pro)
                {
                    res++;
                }
                sum+=arr[j];
                pro*=arr[j];
            }
            if(sum==pro)
            {
                res++;
            }
        }
        return res;
    }
}
