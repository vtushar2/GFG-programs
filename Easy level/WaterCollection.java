class Solution {
    int maxWater(int arr[], int n) {
        // code here
        int max=arr[0];
        int maxindex=0;
        int blocks=0;
        int temp=0;
        for(int i=1;i<n;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
                maxindex=i;
                temp=0;
            }
            else
            {
                blocks+=max-arr[i];
                temp+=max-arr[i];
            }
        }
        if(maxindex<(n-1))
        {
            max=arr[n-1];
            blocks-=temp;
            for(int i=n-1;i>=(maxindex);i--)
            {
                if(arr[i]>max)
                    max=arr[i];
                else
                    blocks+=max-arr[i];
            }
        }
        return blocks;
    }
}
