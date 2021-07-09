class Geeks
{
    // Function to find largest number with minimum frequency
    public static int LargButMinFreq(int arr[], int n)
    {
        // Your code here
        Arrays.sort(arr);
        int a=0;
        for(int i=n-1;i>0;i--)
        {
            if(arr[i]!=arr[i-1])
            {
                a=arr[i];
                break;
            }
        }
        return a;
        
    }
}
