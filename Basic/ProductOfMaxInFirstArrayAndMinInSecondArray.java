class Solution{
    
    // Function for finding maximum and value pair
    public static long find_multiplication (int arr[], int brr[], int n, int m) {
        // Complete the Function
        int max=arr[0];
        int min=brr[0];
        for(int i=1;i<n;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }
        }
        for(int i=1;i<m;i++)
        {
            if(min>brr[i])
            {
                min=brr[i];
            }
        }
        return max*min;
    }
    
}
