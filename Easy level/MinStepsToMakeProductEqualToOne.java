class Solution {
    static int makeProductOne(int[] arr, int N) {
        // code here
        int t=0,z=0;
        for(int i=0;i<N;i++)
        {
            if(arr[i]==0)
            {
                z++;
            }
            if(arr[i]>0)
            {
                t+=arr[i]-1;
                arr[i]=1;
            }
            else if(arr[i]<0)
            {
                t+=-1-arr[i];
                arr[i]=-1;
            }
        }
        int neg=0;
        for(int i=0;i<N;i++)
        {
            if(arr[i]==-1)
            {
                neg++;
            }
        }
        if(neg%2!=0 & z==0)
        {
            return t+2;
        }
        else
        {
            return t+z;
        }
    }
};
